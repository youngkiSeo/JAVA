package com.green.java.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {

        int star =5;
        //중첩 for문을 사용하여 별을 찍어주세요
        //*****

        for(int i=0; i<5; i++){

            for(int z= 0; z<5;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
