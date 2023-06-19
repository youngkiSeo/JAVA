package com.green.java.builder;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = Car.builder().cc(1000).build();
        System.out.println(car1);
        Car car2 = Car.builder().model("소나타").seatCnt(5).build();
        System.out.println(car2);
    }


}
