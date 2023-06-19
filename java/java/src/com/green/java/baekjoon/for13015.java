package com.green.java.baekjoon;

import java.util.Scanner;

public class for13015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = -n + 1; i < n; i++) {   // 행(row) 반복문
            for (int j = -n + 1; j < n; j++) {  // 열(column) 반복문
                if (Math.abs(i) + Math.abs(j) < n) { // 별을 출력할 위치 조건
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
    }

