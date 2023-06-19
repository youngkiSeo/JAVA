package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj {

    char getGrade(int score) {
        if(score >= 90) {
            return 'A';
        } else if(score >= 80) {
            return 'B';
        } else if(score >= 70) {
            return 'C';
        }
        return 'D';

    }
}


public class FlowEx4Method {

    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';

        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj so = new ScoreObj();
        grade = so.getGrade(score); // A~D 뱉어내는게 있어야함



        System.out.printf("%d점의 학점은 %c입니다.\n", score, grade);

        // 90점 보다 크거나 같으면 "%d점의 학점은 A입니다."
        // 80점 보다 크거나 같으면 "%d점의 학점은 B입니다."
        // 70점 보다 크거나 같으면 "%d점의 학점은 C입니다."
        // 나머지 "%d점의 학점은 D입니다."


    }
}