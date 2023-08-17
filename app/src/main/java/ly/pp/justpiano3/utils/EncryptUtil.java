package ly.pp.justpiano3.utils;

import android.util.Log;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import android.util.Base64;

/**
 * @author as
 */
public class EncryptUtil {

    /**
     * 密钥长度（bit）
     */
    private static final int KEY_SIZE = 1024;

    /**
     * 生成RSA公私钥对
     *
     * @return
     */
    public static KeyPair generateRSAKeyPair() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            SecureRandom secureRandom = new SecureRandom();
            keyPairGenerator.initialize(KEY_SIZE, secureRandom);
            return keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            Log.e("EncryptUtil", "generateRSAKeyPair exception", e);
            return null;
        }
    }

    /**
     * 根据公钥字符串生成公钥对象
     *
     * @param publicKeyStr
     * @return
     */
    public static PublicKey generatePublicKey(String publicKeyStr) {
        try {
            byte[] publicKeyBytes = Base64.decode(publicKeyStr, Base64.NO_WRAP);
            X509EncodedKeySpec spec = new X509EncodedKeySpec(publicKeyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(spec);
        } catch (Exception e) {
            Log.e("EncryptUtil", "generatePublicKey exception", e);
            return null;
        }
    }

    /**
     * 根据公钥对象生成公钥字符串
     *
     * @param publicKey
     * @return
     */
    public static String generatePublicKeyString(PublicKey publicKey) {
        return Base64.encodeToString(publicKey.getEncoded(), Base64.NO_WRAP);
    }

    /**
     * 加密/解密处理
     *
     * @param cipher 加密/解密器
     * @param data   加密/解密前的数据
     * @return 加解密结果
     * @throws Exception 异常
     */
    public static byte[] cipherHandle(int mode, Cipher cipher, byte[] data) throws Exception {
        int inputLen = data.length;
        int maxBlockSize = mode == Cipher.DECRYPT_MODE ? KEY_SIZE / 8 : KEY_SIZE / 8 - 11;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > maxBlockSize) {
                cache = cipher.doFinal(data, offSet, maxBlockSize);
            } else {
                cache = cipher.doFinal(data, offSet, inputLen - offSet);
            }
            out.write(cache);
            i++;
            offSet = i * maxBlockSize;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        return encryptedData;
    }
}