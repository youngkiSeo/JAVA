package com.green.java.baekjoon;

import java.util.Scanner;

public class b1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int input3 =input;
        int input2=0;

        int nanugi=input/10;
        int mod=input%10;
        //input2=nanugi;
        input=nanugi+mod;
        //8=2+6
        int N =0;
        int idx=1;
        while (N!=input3){
            input2=input%10;
            input=mod+input2;//14=6+8 // 6=2+4
            mod=input2;

            String str1=Integer.toString(mod%10);
            String str2=Integer.toString(input%10);
            str1=str1+str2;
             N=Integer.valueOf(str1);

            idx++;
        }
        System.out.println(idx);
    }
}
