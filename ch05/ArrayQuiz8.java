package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz8 {
    public static void main(String[] args) {
        int [] numArr= {11,14,27,7,36,35};

        for(int i=0; i<numArr.length; i++){
            if(i==0){
                System.out.printf("[%d,",numArr[i]);
            }else if (i<numArr.length-1){
                System.out.printf(" %d,",numArr[i]);
            } else if (i== numArr.length-1) {
                System.out.printf(" %d]",numArr[i]);
            }

        }
        System.out.println();

        System.out.print("[");
        for(int i=0; i<numArr.length; i++) {
            if (i!=0){
                System.out.printf(",");
            }
                System.out.print(numArr[i]);
        }
        System.out.print("]");
        }

    }



