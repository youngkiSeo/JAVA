package com.green.java.ch05;


/*
        번호  국어  영어  수학  총점  평균
        ==============================
        1   100    90    80   270    90.0
        2   20     20    20    60    20.0
        ....
        ==============================
        총점
        국어: 240
        영어: 230
        수학: 220
        [0][0](1번 개인개인)
        [0][1]국어
 */

public class ArrayEx19 {
    public static void main(String[] args) {

        int no = 0;
        int sum = 0;
        int avg = 0;
        int ko = 0;
        int en = 0;
        int math = 0;


        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==============================");

        int[][] score = {
                  {100, 90, 80}
                , {20, 20, 20}
                , {80, 80, 80}
                , {40, 40, 40}
        };
        for (int i = 0; i < score.length; i++) {
            ko += score[i][0];
            en += score[]
        }

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d   ", i+1);
            for (int j = 0; j < score[j].length; j++) {
                System.out.printf("%d   %d  %d  %d   ", score[0][j]);
                sum += score[j].length;
                avg =  sum % score.length;





            }
        }
    }
}


    int num = Integer.parseInt()