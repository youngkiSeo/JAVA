package com.green.java.ch05;

//p.214

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] temp = {
                {0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };
        System.out.printf("temp.length: %d\n", temp.length);
        System.out.printf("temp.length: %d\n", temp[0].length);
        System.out.printf("temp.length: %d\n", temp[1].length);
        System.out.printf("temp.length: %d\n", temp[2].length);









       int[][]score = new int[4][3];

        System.out.println(score[0][0]);
        score[2][1]=10;

        System.out.println(score.length); //세로
        System.out.println(score[0].length); // 가로([줄 번호선택] + length )
    }
}
