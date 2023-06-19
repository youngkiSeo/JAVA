package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullFileNm = "newjeans.singer.jpg";
        String fileNm, ext;
        int idx = fullFileNm.lastIndexOf("."); // 마지막 점 기준
        //int idx = fullFileNm.indexOf("."); //왼쪽 점 기분
        fileNm = fullFileNm.substring(0,idx);
        ext = fullFileNm.substring(idx + 1);
        System.out.println(fileNm);

//        int len = fullFileNm.length();
//        fileNm = fullFileNm.substring(idx+1, len);
//        System.out.println(fileNm);









    }
}
