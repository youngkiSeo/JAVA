package com.green.java.baekjoon;

import java.util.Scanner;

public class Array10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] num = new int [N];
        int max =1000000;
        int min =-100000;
        for(int i=0; i< num.length; i++){
            int X = scan.nextInt();
            num[i]= X;
        }
        for(int i=0; i< num.length; i++){
            if(max<num[i]){
            max=num[i];
            min=max;
            }
        }
        for(int i=0; i< num.length; i++){
            if(min>num[i]){
                min=num[i];
            }
        }System.out.println(min+" "+max);
    }
}
