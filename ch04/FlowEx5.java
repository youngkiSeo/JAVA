package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', opt = '0';


        System.out.println("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);

        score = scan.nextInt();

        if(score>100 || score<0){
            System.out.println("0~100사이 숫자를 입력하세요");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else {
                opt = ' ';
            }


            if (grade != 'D') {
                int num = score %10;
                if (num >= 8 || score==100) {
                    opt = '+';
                } else if (num < 4) {
                    opt = '-';
                }else {
                    opt='0';
                }
            }
            System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);
        }
    }
}
