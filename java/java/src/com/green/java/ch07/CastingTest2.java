package com.green.java.ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
        //fc= (FireCar) car; //자식타입은 부모를 저장할수없다

    }
}
