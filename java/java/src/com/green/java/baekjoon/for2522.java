package com.green.java.baekjoon;
import java.util.Scanner;
public class for2522 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int star = N;
        int star3=N;

        for (int i = 1; i <= N; i++) {
            for (int z = 1; z < star; z++) {
                System.out.print(" ");

            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }
        int star2=1;
        for(int i=0; i<N-1; i++){
            for(int z=0; z<star2; z++){
                System.out.print(" ");
            }
            for(int z=0; z<star3-1; z++){
                System.out.print("*");
            }
            star2++;
            star3--;
            System.out.println();
        }
    }
    }




