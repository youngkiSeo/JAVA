package com.green.java.ch03;

public class OperatorEx08 {
    public static void main(String[] args) {
        int a = 1_000_000; // , 콤마 사용하면 문자열로 인식. 콤마대신 _ 언더바 사용해서 구분. 출력은 같음
        int b = 1_0_0_0_0_0_0;
        int c = 1000000;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
