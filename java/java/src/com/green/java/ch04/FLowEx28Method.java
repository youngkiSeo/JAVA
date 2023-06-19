package com.green.java.ch04;
import java.util.Scanner;


public class  FLowEx28Method {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int input, answer;

        answer =getRandomNumber(3,5);
        System.out.println(answer);
        getRandomNumber2(3,5);

    }

    public static int getRandomNumber(int num,int num2){
        int answer=0;
            answer = (int) (Math.random() * (num2-num+1)) + num;
       return answer;
    }

    public static void getRandomNumber2(int num,int num2){
        int input=0,answer=0;
        while (true) {
            answer = (int) (Math.random() * (num2 - num + 1)) + num;
            System.out.println(answer);
        }
    }
}

