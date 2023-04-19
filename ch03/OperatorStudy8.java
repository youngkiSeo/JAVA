package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력: ");
        int num = scan.nextInt();
        //System.out.println("num: " + num);


        int a=num%2;

        System.out.println(a >0 ? "홀수" : "짝수");

        //num 값이 홀수면 홀수 출력
        //num 값이 짝수면 짝수출력


    }
}
