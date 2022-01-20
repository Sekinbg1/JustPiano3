package ly.pp.justpiano3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class SkinDownload extends Activity implements Callback {
    public JPApplication jpapplication;
    public JPProgressBar jpProgressBar;
    public LayoutInflater layoutInflater;
    public GridView gridView;
    public List<String> list = new ArrayList<>();
    private Handler handler;
    private ProgressBar progressBar;
    private TextView downloadText;
    private OutputStream outputStream;
    private LinearLayout linearLayout;
    private int progress = 0;
    private int length = 0;
    private int intentFlag = 0;

    static void downloadPS(SkinDownload skinDownload, String str, String str2) {
        Message message = new Message();
        File file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins");
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + str2 + ".ps");
        if (file.exists()) {
            Bundle bundle = new Bundle();
            bundle.putString("name", str2);
            message.setData(bundle);
            message.what = 4;
            skinDownload.handler.sendMessage(message);
            return;
        }
        message.what = 0;
        if (skinDownload.handler != null) {
            skinDownload.handler.sendMessage(message);
        }
        InputStream in = null;
        try {
            URL url = new URL("http://" + skinDownload.jpapplication.getServer() + ":8910/JustPianoServer/server/Skin" + str);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Accept", "application/text"); // 设置接收数据的格式
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); // 设置发送数据的格式
            connection.connect();
            if (connection.getResponseCode() == 200) {
                in = connection.getInputStream();
            }
            Message message2;
            try {
                skinDownload.outputStream = new FileOutputStream(file);
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                skinDownload.length = connection.getContentLength();
                int n;
                while (-1 != (n = in.read(buffer))) {
                    output.write(buffer, 0, n);
                    skinDownload.progress += 4096;
                    message = new Message();
                    message.what = 1;
                    if (skinDownload.handler != null) {
                        skinDownload.handler.sendMessage(message);
                    }
                }
                in.close();
                // byte[] array = GZIP.ZIPToArrayAddHandle(new String(output.toByteArray(), UTF_8), skinDownload.handler, skinDownload.progress);
                byte[] array = output.toByteArray();
                output.close();
                skinDownload.outputStream.write(array, 0, array.length);
                skinDownload.outputStream.close();
                message2 = new Message();
                message2.what = 2;
                if (skinDownload.handler != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("name", str2);
                    message2.setData(bundle2);
                    skinDownload.handler.sendMessage(message2);
                }
                skinDownload.list.add(str2);
            } catch (Exception e3) {
                e3.printStackTrace();
                message2 = new Message();
                message2.what = 3;
                skinDownload.handler.sendMessage(message2);
                try {
                    skinDownload.outputStream.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void getLocalSkinList() {
        List<File> a = SkinAndSoundFileHandle.getLocalSkinList(Environment.getExternalStorageDirectory() + "/JustPiano/Skins");
        int size = a.size();
        for (int i = 0; i < size; i++) {
            String name = a.get(i).getName();
            list.add(name.substring(0, name.lastIndexOf('.')));
        }
    }

    public final void mo2992a(int i, String str, String str2, int i2, String str3) {
        JPDialog jpdialog = new JPDialog(this);
        String str4 = "使用";
        jpdialog.setTitle("提示");
        if (i == 0) {
            jpdialog.setMessage("名称:" + str + "\n作者:" + str3 + "\n大小:" + i2 + "KB\n您要下载并使用吗?");
            str4 = "下载";
        } else if (i == 1) {
            jpdialog.setMessage("[" + str + "]皮肤已下载，是否使用?");
            str4 = "使用";
        } else if (i == 2) {
            jpdialog.setMessage("您要还原默认的皮肤吗?");
            str4 = "使用";
        }
        jpdialog.setFirstButton(str4, new SkinDownloadClick(this, i, str2, str));
        jpdialog.setSecondButton("取消", new DialogDismissClick());
        jpdialog.showDialog();
    }

    public final void mo2993a(String str) {
        Message message = new Message();
        message.what = 5;
        handler.sendMessage(message);
        Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString("skin_list", Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + str);
        File dir = getDir("Skin", Context.MODE_PRIVATE);
        if (dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
        GZIP.ZIPFileTo(new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + str), dir.toString());
        edit.apply();
        Message message2 = new Message();
        message2.what = 6;
        handler.sendMessage(message2);
    }

    @Override
    public boolean handleMessage(Message message) {
        if (!Thread.currentThread().isInterrupted()) {
            switch (message.what) {
                case 0:
                    linearLayout.setVisibility(View.VISIBLE);
                    progressBar.setMax(100);
                    break;
                case 1:
                    progressBar.setProgress(progress * 45 / length);
                    downloadText.setText((progress * 45 / length) + "%");
                    break;
                case 2:
                    linearLayout.setVisibility(View.GONE);
                    downloadText.setVisibility(View.GONE);
                    mo2992a(1, message.getData().getString("name"), "", 0, "");
                    break;
                case 3:
                    linearLayout.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "很抱歉,连接出错!", Toast.LENGTH_LONG).show();
                    break;
                case 4:
                    linearLayout.setVisibility(View.GONE);
                    progressBar.setProgress(100);
                    downloadText.setText("100%");
                    Toast.makeText(getApplicationContext(), "已存在该皮肤!", Toast.LENGTH_LONG).show();
                    mo2992a(1, message.getData().getString("name"), "", 0, "");
                    break;
                case 5:
                    linearLayout.setVisibility(View.GONE);
                    jpProgressBar.show();
                    break;
                case 6:
                    linearLayout.setVisibility(View.GONE);
                    jpProgressBar.dismiss();
                    Toast.makeText(getApplicationContext(), "皮肤设置成功!", Toast.LENGTH_SHORT).show();
                    jpapplication.setBackGround(this, "ground", findViewById(R.id.layout));
                    break;
            }
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (jpProgressBar.isShowing()) {
            jpProgressBar.dismiss();
        }
        if (intentFlag == Intent.FILL_IN_ACTION) {
            Intent intent = new Intent();
            intent.setClass(this, MainMode.class);
            startActivity(intent);
        }
        finish();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jpapplication = (JPApplication) getApplication();
        setContentView(R.layout.skin_list);
        jpapplication.setBackGround(this, "ground", findViewById(R.id.layout));
        intentFlag = getIntent().getFlags();
        layoutInflater = getLayoutInflater();
        jpProgressBar = new JPProgressBar(this);
        handler = new Handler(this);
        gridView = findViewById(R.id.skin_grid_list);
        progressBar = findViewById(R.id.downloadProgress);
        downloadText = findViewById(R.id.downloadText);
        linearLayout = findViewById(R.id.window);
        new SkinDownloadTask(this).execute();
    }
}
