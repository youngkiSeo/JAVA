package com.green.java.baekjoon;

import java.util.Scanner;

public class Array2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numArr =new int[9];
        int max = 0;
        int length = 0;
        for (int i=0; i<numArr.length;i++){
            int num = scan.nextInt();
            numArr[i]=num;

        }
        for(int i=0; i<numArr.length;i++){
            if(max<numArr[i]){
                max=numArr[i];
            }

        }
        for(int i=0; i<numArr.length;i++){
            if(max==numArr[i]){
                length =i+1;
            }
        }
        System.out.println(max);
        System.out.println(length);
    }
}
