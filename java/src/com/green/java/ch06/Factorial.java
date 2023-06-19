package com.green.java.ch06;

public class Factorial {
    public static void main(String[] args) {
        int result = factoriar(4); // factoriar = 한숫자가 1일 될때까지 계속 곱해나가는것.
        System.out.printf("result : %d\n", result);


    }
    static int factoriar(int n) {
        System.out.println(n);
        int result = 0;
        if (n ==1) {
            return 1;

        }
        return n * factoriar(n-1);
    }
}
