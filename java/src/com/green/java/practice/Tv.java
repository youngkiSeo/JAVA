package com.green.java.practice;

public class Tv
{ //Tv속성 멤버변수
    String color;
    boolean power;
    int channel;

    //Tv기능 메서드
    void power() { power =! power; } // { if(power) power = false; else power = true; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvTest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 111;
        t.channelDown();
        System.out.println("현재 채널은" + t.channel + "입니다.");
    }
}

class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");
    }
}

class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");
        t2 = t1;
        t1.channel  = 7;
        System.out.println("t1의 channel을 7로 변경하였습니다.");
        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");
    }
}