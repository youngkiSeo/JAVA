package com.green.java.practice;

public class _ForQuiz10 {
    public static void main(String[] args) {
        //구구단 거꾸로
        //첫번째값 두번째값 구해야함 (%d x %d = %d)

        for (int i = 9; i >= 2; i--) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(" %d x %d = %d\n", i, j, (i * j));
            }
            System.out.println();
        }
    }
}

