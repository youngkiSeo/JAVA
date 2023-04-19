package com.green.java.ch05;

import java.util.Arrays;
/*
 0번방, 1번방 값 스와이핑
 */

public class ArrayQuiz9 {
    public static void main(String[] args) {
        int [] numArr= {11, 14, 2, 7, 36, 35};
        System.out.println(Arrays.toString(numArr));

        int num0= numArr[0];
        numArr[0]=numArr[1];
        numArr[1]=num0;
        System.out.println(Arrays.toString(numArr));


    }
}
