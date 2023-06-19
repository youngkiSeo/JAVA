package com.green.java.ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "http://WWW.codechobo.com";
        float f1 = .10f;
        double d = 1.2345678;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // %갯수만큼(% 3개), 값도 같은 갯수로(f1 3개) 넣어야한다.
        System.out.printf("d=%f\n", d);
        System.out.printf("d=%14.10f\n", d); //14자리, 실수는 10자리
        System.out.printf("d=%.3f\n", d);

        System.out.println("[2345678901234567890]");
        System.out.printf("[%s]\n", url); // String 값 그대로 보여줌
        System.out.printf("[%30s]\n", url); // 기본 오른쪽 정렬, 30칸 확보
        System.out.printf("[%-30s]\n", url); // 왼쪽 정렬 원할시 - 기입
        System.out.printf("[%.8s]\n", url); // .8 왼쪽에서 8개까지 보여줌

    }
}
