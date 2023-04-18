package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args) {
        String r1 = "안녕" + (1 + 1); //소괄호는 우선순위가 높음
        System.out.println(r1);

        String r2 = 1 + 1 + "안녕";
        System.out.println(r2);
    }
}
