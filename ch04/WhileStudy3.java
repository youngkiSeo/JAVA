package com.green.java.ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileStudy3 {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);

        while (true){
            System.out.print("1~100 사이의 정수를 입력:");
            input = scan.nextInt();
            if(input ==0){
                System.out.println("break 사용");
                break;
            }else if(input<answer){
                System.out.println("up");
            }

        }
        System.out.println("good!");
    }
}
