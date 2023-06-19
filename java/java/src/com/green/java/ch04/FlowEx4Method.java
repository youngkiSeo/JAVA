package com.green.java.ch04;

import java.util.Scanner;

class Scoreobj {
    char getGrade(int score) {
        char grade = 'D';
            if (score > 100 || score < 0) {
                System.out.println("점수는 0~100점 사이 입니다.");
            } else {
                if (score >= 90) {
                    return 'A';
                } else if (score >= 80) {
                    return 'B';
                } else if (score >= 70) {
                    return 'C';
                } else {
                    return 'D';
                }
                // System.out.printf("%d점의 학점은 %c입니다.", score, grade);
            }
        return grade;
    }
}

public class FlowEx4Method {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';
        System.out.println("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        Scoreobj obj = new Scoreobj();
        grade = obj.getGrade(score);
        System.out.printf("%d점의 학점은 %c입니다.", score, grade);
    }
}


