package com.green.board11.utils;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;

@Component
public class CommonUtils {

    public String encodeSha256(String source) {
        String mSalt = "abcd123";
        String result = "";

        byte[] a = source.getBytes();
        byte[] salt = mSalt.getBytes();
        byte[] bytes = new byte[a.length + salt.length];

        System.arraycopy(a, 0, bytes, 0, a.length);
        System.arraycopy(salt, 0, bytes, a.length, salt.length);

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(bytes);

            byte[] byteData = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xFF) + 256, 16).substring(1));
            }

            result = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
