package com.green.java.ch06;

public class Tv {
    String color;
    boolean power;
    int channel;

    //클래스 맴버필드
    static String brand;


    void power(){
        power=!power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }

    void test(String str){
        System.out.println(str);
    }

    static String getBrand(){
        return brand;
    }

}
