package com.green.java.ch03; // p.105

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1_000) * 0.001f; // 나누기는 제일 느리기떄문에 * 곱하기로 바꿔준다.
        System.out.println(pi);
        System.out.println(shortPi);

    }
}
