package com.green.java.baekjoon;

import java.util.Scanner;

public class Array10807 {
    public static void main(String[] args) {
        int cnt=0;
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int [] num = new int[N];

        for(int i=0; i<N; i++){
            num[i]= scan.nextInt();
        }
        int N2= scan.nextInt();
        for(int i=0; i<N; i++){
            if(N2 == num[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
