package com.green.java.ch07;

public class MyTvTest {
    public static void main(String[] args) {
        MyTv mt = new MyTv();
        mt.channel=10;
        mt.channelUp();
        mt.channelDown();
        System.out.print(mt.volumn);

        MyTV2 mt2= new MyTV2();
        mt2.speaker =new Speaker();
        mt2.VolumUp();
        mt2.VolumUp();

        System.out.println();

    }
}
