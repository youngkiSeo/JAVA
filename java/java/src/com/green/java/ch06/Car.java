package com.green.java.ch06;

public class Car {
    static String brand; //static은 class 메모리 영역에 brand 라고 하는 공간이 할당됨(Car.brand)
    //static 메서드 or 클래스 메서드
    String model; //인스턴스 메서드 객체를 만들어야 사용할수있음
    int price;
    static void powerOn(){
        System.out.printf("%s 회사의 차 시동걸림",brand);
    }
    void printInfo(){
        System.out.printf("brand: model: %s, price : %d \n" ,brand,model,price);
    }
}
