package com.green.java.baekjoon;

import java.util.Scanner;

public class baekjoon_9316 {
    public static void main(String[] args) {
        int i =1;
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        do {

            System.out.printf("Hello World, Judge %d!\n", i);
            i++;
        }while (i<=N);
    }
}
