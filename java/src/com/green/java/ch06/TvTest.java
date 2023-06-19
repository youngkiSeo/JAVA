package com.green.java.ch06;

public class TvTest {
        public static void main(String[] args) {
                String str = new String("dd"); // String 객체에 스트링에는 스트링 주소값만 담을수있다.
                Tv tv = new Tv();  // 대문자로 시작하는  타입은 객체를 저장한다. 같은 객체만 가능 new: 객체설정, Tv객체 주소만 담을수있다.
                System.out.printf("power : %b\n", tv.power); //주소값 '.'으로만 접근가능.
                System.out.printf("power : %d\n", tv.channel);

                tv.power = true;
                System.out.printf("power : %b\n", tv.power);
                tv.power(); // ("=Tv객체에있는 power메소드를 호출했다고 읽음.")
                System.out.printf("power : %b\n", tv.power);

                tv.channelUp();
                tv.channelUp(); //"=Tv객체에있는 channelUp메소드를 호출했다고 읽음."
                System.out.printf("channel : %d\n", tv.channel);

                System.out.printf("channel : %d\n", tv.channel);

                Tv tv2 = tv; // tc변수에 있는 주소값을 tv2에 복사했다(쉘로우카피:얇은카피)
                System.out.printf("channel : %d\n", tv.channel);


        }
}

