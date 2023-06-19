package com.green.java.ch02;

public class VariableString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        //대문자로 저장되는 값은 100프로 주소값

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        //String s3 = "HelloWorld");
        System.out.println(s3);

        String s4 = s1 + " " + s2;
        // "Hello " + s2
        // "Hello World"
        // 왼쪽부터 대입되서 순서대로 대입됨
        System.out.println(s4);

    }
}
