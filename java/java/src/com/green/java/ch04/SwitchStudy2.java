package com.green.java.ch04;

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요");
        Scanner scan= new Scanner(System.in);
        int score = scan.nextInt();
        String grade ="D";
        String otp=" ";

        switch (score/10) {
            case 10:
                grade="A";
                break;
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            default:
        }
        switch(score%10){
            case 10: case 9: case 8:
                otp="+";
                break;
            case 7: case 6: case 5:
                otp="-";
                break;
        }

        System.out.printf("%d점의 학점은%s%s입니다.",score, grade,otp );
    }
}
