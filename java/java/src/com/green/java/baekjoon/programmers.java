package com.green.java.baekjoon;

import java.util.Scanner;

public class programmers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N= scan.nextInt();
        int star=N;
        int star2=0;

        for(int i=0; i<N; i++){
           for(int z=0; z<star2; z++){
               System.out.print(" ");
           }
            for(int z=0; z<star; z++){
                System.out.print("*");
            }
            star--;
            star2++;
            System.out.println();
        }
    }
}
