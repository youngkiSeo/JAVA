package com.green.java.ch07;

import java.util.ArrayList;
import java.util.Arrays;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Tv3 tv3 = new Tv3();
        Computer3 com3 = new Computer3();
        Buyer3 buyer3 = new Buyer3();
//        buyer3.buy3(tv3);
//        buyer3.buy3(com3);
//        buyer3.buy3(new Audio3());
//        buyer3.buy3(new Audio3());
//        buyer3.buy3(new Audio3());
        buyer3.summary();
        buyer3.printState3();

        //buyer3.printState3();
    }
}


class Buyer3 {
    private int money;
    private int bonusPoint;
    private Product3[]items;
    private ArrayList<String>list;
    private int idx;

    Buyer3() {
        this.money = 1000;
        this.bonusPoint = 0;
        this.items= new Product3[10];
        this.list=new ArrayList<>();
        this.idx=0;
    }
    void buy3(Product3 product) {

//        for (int i = 0; i < items.length; i++) {
//            if(items[i]==null){
//                items[i]=product;
//                break;
//            }
//        }
        items[idx++]=product;

        System.out.printf("%S을 %d만원에 구매하였습니다.\n", product.toString(), product.getPrice());
        this.money-= product.getPrice();
        this.bonusPoint += product.getBonusPoint();
        //items[idx++]=product;
    }
    void summary(){
        System.out.print("현재 구입하신 제품은 "+items[0]);
        for (int i = 1; i <idx; i++) {
            System.out.print(","+items[i]);
        }
        System.out.printf(" 총 %d개입니다.\n",idx);
    }
    void printState3() {

        System.out.printf("나의 잔고: %d만원\n", this.money);
        System.out.printf("보너스 점수는 %,d 점입니다\n", this.bonusPoint);
    }
}

class Product3 {
    protected int price;
    protected int bonusPoint;

    Product3(int price) {
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

class Computer3 extends Product3 {

    public Computer3() {
        super(200);
    }

    @Override
    public String toString() {
        //return getClass().getName()+"@"+Integer.toHexString(hashCode());
        return "Computer";
    }

}

class Tv3 extends Product3{
    public Tv3(){
        super(100);
    }
    @Override
    public String toString(){
        return "TV";
    }
}
class Audio3 extends Product3{
    public Audio3() {
        super(50);
    }
    @Override
    public String toString(){
        return "Audio3";
    }
}