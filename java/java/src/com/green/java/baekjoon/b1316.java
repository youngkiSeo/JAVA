package com.green.java.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String [] score = new String[N];
        String [] score2 = new String[score[0].length()];
        for (int i = 0; i <score.length; i++) {
            score[i]=scan.next();
        }
        for (int i = 0; i <score.length; i++) {
            score2[i]=score[i];
        }
    }
}
