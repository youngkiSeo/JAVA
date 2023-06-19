package com.green.java.baekjoon;

import java.util.Scanner;
public class Array5597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] student = new int[31];
        for (int i = 1; i < 29; i++) {
            int num=scan.nextInt();
            student[num]=num;
        }
        for (int i = 1; i < student.length; i++) {
            if(student[i]==0){
                System.out.println(i);
            }
        }
    }
}
