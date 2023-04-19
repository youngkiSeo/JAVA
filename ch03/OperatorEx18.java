package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141_592;
        double shortPi = Math.round(pi*1000) / 1000.0; // Math.round 반올림해주는 메서드 실수 버림
        System.out.println(shortPi);

        System.out.println(Math.round(315.4)); // Math.round 실수 제거 반올림
        System.out.println(Math.ceil(315.4)); // Math.ceil 올림
        System.out.println(Math.ceil(315.0000)); // Math.ceil 올림
        System.out.println(Math.floor(315.4)); // Math.floor 내림


    }
}
