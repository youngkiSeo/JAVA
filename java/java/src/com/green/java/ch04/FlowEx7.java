package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int com = (int)(Math.random() *3) +1;

        System.out.printf("당신은 %d입니다.", user);
        System.out.printf("컴퓨터는 %d입니다.",com);

    }
}
