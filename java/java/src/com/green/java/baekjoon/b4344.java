package com.green.java.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int [][] score = new int [5][9];

       int N=0;

        for (int i = 0; i <5; i++) {
             N= scan.nextInt();

            for (int z = 0; z <N; z++) {
                score[i][z]=scan.nextInt();
            }
            N= scan.nextInt();
        }
        System.out.println(Arrays.toString(score));
    }
}
