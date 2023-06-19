package com.green.java.ch06;

public class Car {
    static String brand; // static 객체화를 했기때문에 메모리에 올라감.
    String model; // 객체화 되지않음.(static) 객체화를 안하면 메모리에 올라가지 않음
    int price; // 인스턴스 필드

    static void powerOn() {
        System.out.printf("%s 회사의 차 시동 걸림\n", brand);
    }

    void printInfo() {
        System.out.printf("brand: %s, model : %s, price: %d\n"
                , brand, model, price);
    }
}