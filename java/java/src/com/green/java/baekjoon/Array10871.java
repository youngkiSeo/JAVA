package com.green.java.baekjoon;

import java.util.Scanner;

public class Array10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int X= scan.nextInt();
        int [] num = new int[N];
        for(int i=0; i<num.length; i++){
            int Y = scan.nextInt();
            num[i] = Y;
        }

        for(int i=0; i<num.length; i++){
            if(num[i]<X)
            System.out.print(num[i]);
        }
    }
}
