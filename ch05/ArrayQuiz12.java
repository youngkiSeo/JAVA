package com.green.java.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        for (int i = 0; i < numArr.length; i++) {
            int rand = (int) (Math.random() * numArr.length);
           if(i==rand){continue;}
            int num = numArr[i];
            numArr[i] = numArr[rand];
            numArr[rand] = num;

            System.out.printf("numArr[%d],랜덤인덱스[%d]", i, rand);
            System.out.println(Arrays.toString(numArr));

        }
        //System.out.println(Arrays.toString(numArr));
    }
}
