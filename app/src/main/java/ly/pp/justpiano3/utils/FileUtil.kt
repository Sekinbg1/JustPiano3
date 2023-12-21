package ly.pp.justpiano3.utils

import android.content.Context
import android.net.Uri
import android.provider.DocumentsContract
import android.provider.OpenableColumns
import androidx.core.util.Consumer
import androidx.documentfile.provider.DocumentFile
import okhttp3.Request
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.OutputStream


object FileUtil {

    /**
     * 复制文件到应用目录
     */
    fun copyFileToAppFilesDir(context: Context, sf2File: File): String? {
        val cacheFile = File(context.filesDir, sf2File.name)
        try {
            FileInputStream(sf2File).use { inputStream ->
                FileOutputStream(cacheFile).use { outputStream ->
                    val buf = ByteArray(1024)
                    var len: Int
                    while (inputStream.read(buf).also { len = it } > 0) {
                        outputStream.write(buf, 0, len)
                    }
                }
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return cacheFile.absolutePath
    }

    /**
     * 移动文件到新文件的位置（拷贝流）
     *
     * @param src 源文件对象
     * @param des 目标文件对象
     */
    fun moveFile(src: File, des: File): Boolean {
        if (!src.exists()) {
            return false
        }
        if (des.exists()) {
            des.delete()
        }
        try {
            BufferedInputStream(FileInputStream(src)).use { reader ->
                BufferedOutputStream(
                    FileOutputStream(des)
                ).use { writer ->
                    val buffer = ByteArray(1024)
                    var length: Int
                    while (reader.read(buffer).also { length = it } != -1) {
                        writer.write(buffer, 0, length)
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        } finally {
            src.delete()
        }
        return true
    }

    fun getUriInfo(context: Context, uri: Uri): UriInfo {
        val contentResolver = context.contentResolver
        val queryCursor = contentResolver.query(
            uri,
            arrayOf(OpenableColumns.DISPLAY_NAME, OpenableColumns.SIZE, DocumentsContract.Document.COLUMN_MIME_TYPE),
            null,
            null,
            null
        )
        var displayName: String? = null
        var fileSize: Long? = null
        queryCursor.use { cursor ->
            if (cursor != null && cursor.moveToFirst()) {
                val nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                val sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE)
                val mimeTypeIndex = cursor.getColumnIndex(DocumentsContract.Document.COLUMN_MIME_TYPE)
                if (nameIndex != -1) {
                    displayName = cursor.getString(nameIndex)
                }
                // Check if the document is a directory by MIME type
                if (mimeTypeIndex != -1 && DocumentsContract.Document.MIME_TYPE_DIR == cursor.getString(mimeTypeIndex)) {
                    fileSize = 0L
                } else if (sizeIndex != -1 && !cursor.isNull(sizeIndex)) {
                    fileSize = cursor.getLong(sizeIndex)
                }
            }
        }
        return UriInfo(uri, displayName, fileSize)
    }

    data class UriInfo(val uri: Uri?, val displayName: String?, val fileSize: Long?)

    fun downloadFile(
        url: String,
        file: File?,
        progress: Consumer<Int?>,
        success: Runnable,
        fail: Runnable
    ) {
        val request: Request = Request.Builder().url(url).build()
        try {
            OkHttpUtil.client().newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    var start = System.currentTimeMillis()
                    val length = response.body!!.contentLength()
                    // 下面从返回的输入流中读取字节数据并保存为本地文件
                    try {
                        response.body!!.byteStream().use { inputStream ->
                            FileOutputStream(file).use { fileOutputStream ->
                                val buf = ByteArray(100 * 1024)
                                var sum = 0
                                var len: Int
                                while (inputStream.read(buf).also { len = it } != -1) {
                                    fileOutputStream.write(buf, 0, len)
                                    sum += len
                                    if (System.currentTimeMillis() - start > 200) {
                                        start = System.currentTimeMillis()
                                        progress.accept((sum * 1.0f / length * 100).toInt())
                                    }
                                }
                                success.run()
                            }
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                        fail.run()
                    }
                } else {
                    fail.run()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            fail.run()
        }
    }

    fun getFileOutputStream(context: Context, dirUri: Uri?, fileName: String?): OutputStream? {
        // 获取DocumentFile引用，它代表dirUri指向的目录
        val directory = DocumentFile.fromTreeUri(context, dirUri!!)
        if (directory == null || !directory.exists()) {
            return null
        }
        // 在目录中查找现有文件
        var file = directory.findFile(fileName!!)
        // 如果文件不存在，尝试创建新文件
        if (file == null || !file.exists()) {
            file = directory.createFile("*/*", fileName)
        }
        // 如果文件创建成功，或已经存在，则获取并返回输出流
        return if (file != null && file.exists()) {
            context.contentResolver.openOutputStream(file.uri)
        } else {
            return null
        }
    }
}