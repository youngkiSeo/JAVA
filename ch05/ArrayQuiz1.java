package com.green.java.ch05;

public class ArrayQuiz1 {
    public static void main(String[] args) {
        int [] numArr = {0,0,0};
        for(int i=0; i<numArr.length; i++){
            numArr[i] = i+1;
        }
        for(int i=0; i<numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }
}
