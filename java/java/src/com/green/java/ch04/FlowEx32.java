package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while(true){
            System.out.println("(1)squre");
            System.out.println("(2)squre root");
            System.out.println("(3)log");
            System.out.println("원하시는 메뉴(1~3)를 선택하세요. (종료: 0)");

            int input = scan.nextInt();
            if(input>0 && input<4){
                System.out.printf("선택하신메뉴는 %d입니다\n",input);
            }
            else if(input>3 ||input<0){
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료: 0)");
                continue;
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
