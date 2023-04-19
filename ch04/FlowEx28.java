package com.green.java.ch04;

import java.util.Random;
import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);

        do {
            System.out.println("1~100사이의 정수 입력 하세요");
            input = scan.nextInt();
//            if (answer == input) {
//                System.out.println("정답입니다.");
//                System.out.println("컴퓨터의 숫자는 : " + answer);
//            }
             if (input > 100 || input < 0) {
                System.out.println("입력오류");

            } else if (answer < input) {
                System.out.println("down");

            } else if (answer > input) {
                System.out.println("up");
            }
        } while (answer != input);
        System.out.println("정답입니다.");
        System.out.println("컴퓨터의 숫자는 : " + answer);
    }
}

