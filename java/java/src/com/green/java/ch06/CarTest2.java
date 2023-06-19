package com.green.java.ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model="소나타";
        c1.price=5000;
        Car.brand = "기아";

        //Car.powerOn(); //객체생성하지않고도 메소드 호출할수있는건 static 메서드
        c1.printInfo();
        Integer.parseInt("11");

    }
}
