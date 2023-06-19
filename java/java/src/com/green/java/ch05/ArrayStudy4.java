package com.green.java.ch05;

// light copy

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] numArr = new int[] { 10, 20, 30, 40, 50 };
        int[] copyArr = numArr; // 라이트 카피

       copyArr[0] = 123; //numArr[0] = 123;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);


        }
    }
}


