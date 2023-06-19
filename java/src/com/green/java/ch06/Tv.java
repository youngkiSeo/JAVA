package com.green.java.ch06;

public class Tv {
        //인스턴스 멤버필드
        String color; // 대문자로 시작하는 거는 초기화안하면 무조건 'null(주소값 없는 상태)'로 대답.
        boolean power;
        int channel;

        //클래스 멤버필드
        static String brand;


        //메소드
        void power() {
                power = !power;
        }

        void channelUp() {
                ++channel;
        }

        void channelDown() {
                --channel;
        }
        void test(String str) {
                System.out.println(str);

        }
        //멤버필드 사용시 static 사용 불가.
        static String getBrand() {
                return brand;
}
}
