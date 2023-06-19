package com.green.java.ch05;

// deep copy

public class ArrayStudy5 {
    public static void main(String[] args) {
        int[] numArr = new int[] { 10, 20, 30, 40, 50 };
        int[] copyArr = new int[numArr.length];

        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = numArr[i];   //deep copy  존재가 2개가 생김.

        }
        numArr[0] = 9;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);

        }
    }
}
