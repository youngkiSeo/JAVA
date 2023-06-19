package com.green.java.ch06;

public class Tv extends Object{
    String color;
    boolean power;
    int channel;

    //클래스 맴버필드
    static String brand;

    Tv(){
        super(); //부모 클래스의 생성자 호출
    }


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
