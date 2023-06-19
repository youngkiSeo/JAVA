package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. >");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input + 1); // 문자열 더하기 문자열이므로 11
        System.out.printf("num=%d\n", num + 1); // 정수더하기 정수는 숫자이므로 2


    }
}
