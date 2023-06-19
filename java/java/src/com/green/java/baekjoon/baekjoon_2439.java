package com.green.java.baekjoon;

import java.util.Scanner;

public class baekjoon_2439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();

        for(int i=1; i<=N; i++){
            for(int z=1; z<=N-i; z++){
                System.out.print(" ");
            }
            for(int y=1; y<=i; y++){
                System.out.print("*");
            }
            System.out.println();
        }


        }
    }
