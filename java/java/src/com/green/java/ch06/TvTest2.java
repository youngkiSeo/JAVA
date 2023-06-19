package com.green.java.ch06;

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        for (int i = 0; i < 10; i++) {
            tv.channelUp();
        }
        System.out.printf("channel : %d \n", tv.channel);

        for (int i = 0; i < 1045450; i++) {
            tv.channelDown();
        }
        System.out.printf("channel : %d \n", tv.channel);
    }
}


class Tv2 {
    String color;
    boolean power;
    int channel;
    void power(){
        power=!power;
    }

    final int MAX_Channel=5;
    final int MIN_Channel=1;
    void channelUp(){
        if(channel< MAX_Channel){
            ++channel;
        }
    }
    void channelDown(){
        if(channel> MIN_Channel){
            channel--;
        }
        //channel--;
    }
}
