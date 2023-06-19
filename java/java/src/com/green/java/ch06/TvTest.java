package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {

        Tv tv = new Tv(); //new 오른쪽에 객체화 하고싶은 class를 적어줌, \
        // 왼쪽에는 TV타입(TV객체의 주소값을 저장할수있는 변수를 )TV 레퍼런스변수를 만듬
        String str = new String("dd"); // String 타입의 변수만 담을수있음
        //프라티브타입
        System.out.printf("power : %b \n",tv.power);
        tv.power = true;
        System.out.printf("power: %b \n", tv.power);
        Time time = new Time();
        time.getHour();
        time.setMinute(18);

        System.out.printf("channel : %d \n",tv.channel);
        tv.channel =7;
        System.out.printf("channel : %d \n",tv.channel);
        tv.channelDown();
        System.out.printf("channel : %d \n",tv.channel);
        tv.channelUp();
        System.out.printf("channel : %d \n",tv.channel);

        Tv tv3 = new Tv();
        System.out.println(tv3.channel);

    }
}
