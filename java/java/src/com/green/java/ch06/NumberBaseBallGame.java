package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {
    public static void main(String[] args) {
        final int NUMBER_COUNT =3;
        int [] numArr = getRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("[Game Start]");
        int []  myArr = new int[NUMBER_COUNT];
        int cnt=0;
        while (true){
        int S = 0, B = 0, O = 0 ;
            cnt++;
            for (int i = 0; i <NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력: ",i);
                myArr[i]=scan.nextInt();

            }
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int z = 0; z < NUMBER_COUNT; z++) {
                    if (numArr[i] == myArr[z]) {
                        if (i == z) {
                            S++;
                        } else {
                            B++;
                        }
                    }
                }
            }
            O = NUMBER_COUNT - (S + B);
            System.out.println("S =" + S + "B=" + B + "O=" + O);
            if(S==NUMBER_COUNT){
                break;
            }
        }
        System.out.println("[Game Over] 시도한횟수"+cnt);
    }
    public static int[] getRandomNumberArr(int NUMBER_COUNT){
        int[] arr = new int[NUMBER_COUNT];
        int selectedIdx=0;
        Loop:
        while(selectedIdx< arr.length){
            int rVal = getRadomNumber2(1,9);
            for (int i = 0; i <selectedIdx; i++) {
                if (arr[i] == rVal){
                continue Loop;
            }

            }
            arr[selectedIdx++] = rVal;
        }
        return arr;
    }
    public static int getRadomNumber2(int min, int max) {

        return (int) (Math.random() * (max-min+1)) + min;
    }
}