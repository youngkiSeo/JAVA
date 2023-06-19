package com.green.java.ch06;

class Tv1{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {channel++;}

    void channelDown(){channel--;}
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCation(String txt){
        if(caption){
            System.out.println(txt);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.caption=true;
        ctv.displayCation("자막 나오나?");
    }
}
