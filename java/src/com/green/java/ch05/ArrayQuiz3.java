package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    각방의 짝수 값만 콘솔에 출력해주세요.
    14
    2
    36
 */


public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] rNumArr = {11, 14, 2, 7, 36, 35};
        for (int i = 0; i < rNumArr.length; i++)
            // System.out.println(numArr[0] % 2 == ? "짝수" : "홀수");
            if (rNumArr[i] % 2 == 0) {
                System.out.println(rNumArr[i]);

//                if (rNumArr[0] % 2 == 0) {
//                    System.out.println(numArr[0]);
//                    if (rNumArr[1] % 2 == 1) {
//                    System.out.println(numArr[1]);
//                        if (rNumArr[2] % 2 == 0) {
//                    System.out.println(numArr[3]);
//                            if (rNumArr[3] % 2 == 0) {
            }
    }
}



