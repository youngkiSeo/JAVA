package com.green.java.ch06;

import java.util.Scanner;

public class BikeTest {
    public static void main(String[] args) {
        Bike b1 = new Bike(); // new Bike -> 생성자 호출
        //new 키워드로 생성자를 호출합니다 기본생성자를 JVM이 자동으로 해줌
        //파라미터 생성자가 하나라도 있으면 JVM이 자동으로 만들어 주지 않는다
        Scanner scan = new Scanner(System.in);

        b1.brand="혼다";
        Bike b2 = new Bike("야마하");

        System.out.println("b1.brand: " + b1.brand);
        System.out.println("b1.brand: " + b2.brand);

    }
}
