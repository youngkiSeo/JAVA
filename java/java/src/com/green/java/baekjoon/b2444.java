package com.green.java.baekjoon;

import java.util.Scanner;

public class b2444 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int star = input;
        for (int i = 0; i <input; i++) {

            for (int z = 1; z <star; z++) {
                System.out.print(" ");
            }
            for (int z = 0; z <=i; z++) {
                System.out.print("*");
            }
            for (int z = 0; z <i; z++) {
                System.out.print("*");
            }
            star--;
            System.out.println();
        }
        int star2=0;
        int star3=input;
        for (int i = 1; i <input; i++) {
            for (int z = 0; z <=star2; z++) {
                System.out.print(" ");
            }
            for (int z = 1; z <star3; z++) {
                System.out.print("*");

            }
            for (int z = 2; z <star3; z++) {
                System.out.print("*");

            }
            star2++;
            star3--;
            System.out.println();
        }
    }
}
