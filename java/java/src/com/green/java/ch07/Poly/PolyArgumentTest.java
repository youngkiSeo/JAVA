package com.green.java.ch07.Poly;

import java.util.Arrays;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv); //Tv를 100만원에 구매하였습니다
        buyer.buy(com);
        buyer.buy(com);
        buyer.printState(); //나의 잔고
    }
}

class Buyer {
    private int money;
    private int bonusPoint = 0;
    private String[]buyproduct=new String[10];

    Buyer() {
        this.money = 1000;
        this.bonusPoint = 0;
        this.buyproduct[0]=null;
    }

    void buy(Product product) {
        //.money=this.money-product.getPrice();
        this.money -= product.getPrice();
        System.out.printf("%S을 %d만원에 구매하였습니다.\n", product.toString(), product.getPrice());
        this.bonusPoint += product.getBonusPoint();

        for (int i = 0; i < buyproduct.length; i++) {

        }
    }

    void printState() {
        System.out.printf("나의 잔고: %d만원\n", this.money);
        System.out.printf("보너스 점수는 %,d 점입니다\n", this.bonusPoint);
    }
}

class Product {
    protected int price;
    protected int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }

    public int getPrice() {

        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}

class Computer extends Product {
    //생성자는 1. return타입이 없다. class 명이랑 같다. 생성자는 클래스가 new 표현식에 의해 인스턴스화되어
    // 객체를 생성할 때 객체의 레퍼런스를 생성하기 전에 객ㅊ의 초기화를 위해 사용되는 코드 블록이다.
    public Computer() {
        super(200);
    }

    //오버라이딩 object메소드를 오버라이딩함
    @Override
    public String toString() {
        //return getClass().getName()+"@"+Integer.toHexString(hashCode());
        return "Computer";
    }

}

class Tv2 extends Product{
    public Tv2(){
        super(100);
    }
    @Override
    public String toString(){
        return "TV";
    }
}

