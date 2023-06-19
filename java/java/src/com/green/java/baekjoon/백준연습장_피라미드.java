package com.green.java.baekjoon;

import java.util.Scanner;

public class 백준연습장_피라미드 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int star=N;
        for(int i=1; i<=N; i++){
            for(int z=1; z<star; z++){
                System.out.print("_");
            }
            for(int z=0; z<i; z++){
                System.out.print("*");
            }
            System.out.println();
            star--;
        }
    }
}
