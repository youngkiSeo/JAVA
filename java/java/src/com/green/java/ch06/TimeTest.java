package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(); //객체화

        Scanner scan = new Scanner(System.in);
        while(true) {
            int input = scan.nextInt();
            if(input ==0){
                break;
            }
            time.setHour(input);
            //private 일때는 메소드로 값을 준다
            System.out.println(time.getHour());
        }
    }
}
