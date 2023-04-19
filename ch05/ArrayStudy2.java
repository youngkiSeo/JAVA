package com.green.java.ch05;

import java.util.Scanner;

public class ArrayStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] num  = new int [5];
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);

        //boolean 타입의 default 값은 false;
            //String 배열

        }
        boolean[] boolArr = new boolean[4];
        for(int i=0; i<boolArr.length; i++){
            System.out.println(boolArr[i]);
        }

        String [] strArr = new String[3];
        for(int i=0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
}
