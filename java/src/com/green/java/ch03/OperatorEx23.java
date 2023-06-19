package com.green.java.ch03; // p.105

import java.sql.SQLOutput;

public class OperatorEx23 {
    public static void main(String[] args) {
       String s1 = "abc";
       String s2 = new String("abc");
       String s3 = new String("abc");
       System.out.printf("\"abc\" == \"abc\" ? %b\n", s1 == s2);
        // " 쌍따옴표를 표시하고싶으면 \역슬러쉬로 구분해주면 표시됨(""abcd");로 하면 에러뜸. ("\abcd");로 해줌
        System.out.println("abc".equals("abc"));
        System.out.printf("s1 == s2 ? %b\n", s1 == s2);
        System.out.printf("s2 == s3 ? %b\n", s2 == s3);
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));

        String s4 = new String("aBc");
        System.out.println("s1.equals(s4) : " + s1. equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));
    }
}

