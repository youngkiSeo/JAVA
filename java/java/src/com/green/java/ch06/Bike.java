package com.green.java.ch06;

public class Bike {
    String brand; //필드
    String model;
    int price;
    public Bike(){
        //생성자만드는법: return 타입이 없고, 클래스명이랑 같으면 된다
        //기본생성자 defalut constructor
        //파라미터가 하나도 없는  생성자
        //최초 딱 한번 객체 생성할 때 호출할수있음
        //System.out.println("Bike 생성자");
    }

    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
        public Bike(Bike bike){
            this.brand= bike.brand;
            this.model=bike.model;
            this.price=bike.price;
    }
    public Bike(String brand){
        //파라미터 매개변수만 다르다면 여러개를 만들수있음
        this.brand = brand;
        //String 타입의 야마하가 brand 매개변수로 들어감
        // this는 나 자신

    }
    void drive(){
        System.out.printf("%s 브랜드 %s 모델이 달린다.",this.brand,this.model);
    }
}