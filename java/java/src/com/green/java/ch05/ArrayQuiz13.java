package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int [] lottoArr = new int [6];
        setRandomValueArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
        sortArr(lottoArr);
        printlottoArr(lottoArr);
        //System.out.println(Arrays.toString(lottoArr));

    }
    public static int getRandomValueFromTo(int sVal, int eVal){
        return (int)(Math.random()*eVal-sVal+1)+sVal;
    }


    public static void setRandomValueArr(int [] lottoArr){
        for (int i = 0; i <lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1,45);
            for (int z = 0; z <lottoArr.length; z++) {
                if(lottoArr[z]==0){
                    lottoArr[z]=rVal;
                    break;
                } else if (lottoArr[z]==rVal) {
                    i--;
                    break;
                }
            }
        }
    }
    public static void setRandomValueArr2(int [] lottoArr){
        int idx=0;
        Loop:
        while(idx<lottoArr.length){
            int lottoRand = getRandomValueFromTo(1,45);
            for (int j = 0; j <idx; j++) {
                if (lottoArr[j] == lottoRand){
                    continue Loop;
                }
            }
            lottoArr[idx]=lottoRand;
            idx++;
        }

    }

    public static void sortArr(int [] lottoArr){
        int num=0;
        for (int i = lottoArr.length; i > 1; i--) {
            for (int z = 1; z < i; z++) {
                 if (lottoArr[z-1]>lottoArr[z]){
                    num=lottoArr[z-1];
                    lottoArr[z-1]=lottoArr[z];
                    lottoArr[z]=num;
                }
                //System.out.println(i+" "+z+" "+Arrays.toString(lottoArr));
            }
        }
    }
    public static void printlottoArr(int [] lottoArr){
        System.out.print("["+lottoArr[0]);
        for (int i = 1; i <lottoArr.length; i++) {
            System.out.print(", "+lottoArr[i]);
        }
        System.out.println("]");
    }
}
