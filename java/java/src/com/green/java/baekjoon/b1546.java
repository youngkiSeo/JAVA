package com.green.java.baekjoon;

import java.util.Scanner;

public class b1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int [] score = new int [N];
        int num=0;
        int max =0;
        for (int i = 0; i <score.length; i++) {
            score[i]=scan.nextInt();
        }
        for (int i = 0; i <score.length; i++) {
            if (max<score[i]){
                max=score[i];
            }
        }
        double sum=0;
        for (int i = 0; i <score.length; i++) {
            sum+= ((double) score[i] /max)*100;
            }
        sum= (double) sum/N;
        System.out.println(sum);
    }

}

