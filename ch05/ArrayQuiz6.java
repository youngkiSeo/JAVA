package com.green.java.ch05;

public class ArrayQuiz6 {
    /*
    numArr 배열을 이용하여
    copyArr에 numArr을 depp copy 해주세요
    copyArr값을 모두 출력해주세요

     */
    public static void main(String[] args) {
        int [] numArr = { 11, 14, 2, 7, 36, 35};
//        int[] copyArr= numArr;
//
//        for(int i=0; i<copyArr.length; i++){
//            System.out.printf("copyArr[%d] > %d \n ",i,copyArr[i]);
//        }
        int[] CopyArr = new int[numArr.length];
        for (int i = 0; i < CopyArr.length; i++) {
            CopyArr[i] = numArr[i];
        }
        numArr[0]=33;

        for (int i = 0; i < CopyArr.length; i++) {
            System.out.printf("CopyArr[%d] > %d \n", i, CopyArr[i]);
        }
        System.out.println();
        for (int i = 0; i < CopyArr.length; i++) {
            System.out.printf("numArr[%d] > %d \n", i, numArr[i]);
        }
    }
}
