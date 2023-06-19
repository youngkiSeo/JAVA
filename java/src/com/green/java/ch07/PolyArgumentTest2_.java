package com.green.java.ch07;

public class PolyArgumentTest2_ {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio3());
        b.summary();
        //구입하신 제품은, Tv, Computer, Audio, Audio 총 4개입니다.

    }
}



