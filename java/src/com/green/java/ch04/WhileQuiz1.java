package com.green.java.ch04;

//While문으로 해결
//랜덤값 1~100사이의 랜덤값
//1~100사이의 정수를 입력: 50
//down
//1~100사이의 정수를 입력: 25
//up
//1~100사이의 정수를 입력: 30
//good!
//조건식 내가 입력한 값과 랜덤값이 다르다면

import java.util.Scanner;
public class WhileQuiz1 {
    public static void main(String[] args) {
        int input, answer;
        //0.00000000 ~ 0.9999999999
        Scanner scan = new Scanner(System.in);
        answer = (int)(Math.random() * 100) + 1; // 1~100
        System.out.println(answer);

        System.out.print("1~100사이의 정수를 입력: ");
        input = scan.nextInt();
        System.out.println();

        while(input != answer) {
            if (input > answer) {
                System.out.print("down");
            }else if(input > answer) {
                System.out.print("up");
            }
            System.out.print("1~100사이의 정수를 입력: ");
            input = scan.nextInt();

            System.out.println();
        }





    }
}