package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "남규진";
        System.out.print("나이 입력: ");
        int age = scanner.nextInt();

        System.out.printf("나의 이름은 %s이고 나이는 %d살 입니다.", name, age);
    }
}
