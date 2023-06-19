package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력: ");
        int num = scan.nextInt();
        System.out.println("num : " + num);


        String result = num % 2 == 0 ? "짝수" : " 홀수";
        System.out.printf("숫자 %d는 %s이다.", num, result);
        //num 값이 홀수면 " 홀수" 출력.
        //num 값이 짝수면 " 짝수" 출력.

        System.out.printf(num %2 == 0 ? "짝수" : "홀수");
        //스트링이 불린을 이긴다.


    }
}
