package com.green.java.ch05;

public class ArrayQuiz2 {
    public static void main(String[] args) {
        int [] rNumArr = new int[6];
        for(int i=0; i<rNumArr.length; i++){

            int lotto=(int)(Math.random()*45)+1;
            rNumArr[i]=lotto;
        }

        for(int i=0; i<rNumArr.length; i++){
            System.out.println(rNumArr[i]);
        }
    }
}
