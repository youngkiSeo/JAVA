package com.green.java.ch05;
/*
 score [0][0]=100;

 */

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
        };
        int sum=0;
        for (int i = 0; i <score.length; i++) {
            for (int z = 0; z <score[z].length; z++) {
                System.out.printf("score[%d][%d] = %d \n",i,z,score[i][z]);
                sum+=score[i][z];
            }
        }
        System.out.print("sum = " +sum);
    }
}
