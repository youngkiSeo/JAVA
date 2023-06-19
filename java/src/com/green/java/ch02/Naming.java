package com.green.java.ch02;

public class Naming {
    public static void main(String[] args) {
        //단어 + 단어 + 단어

        //Hello World Bye
        //기법
        //파스칼 케이스 기법 > 클래스명 사용
        String HelloWorldBye;

        //카멜 케이스 기법 > 변수명, 메소드명
        String helloWorldBye;

        //스네이크 기법
        String hello_world_bye;

        //케밥 케이스 기법
        //String hello-world-bye;
        //자바에서는 사용 안함

        //자바 이름에 쓸 수 있는 특수기호 2개 : _ , $
        String _hi, h$i;
        
        //이름 처음에 숫자 사용할 수 없다. but 처음만 아니면 된다.
        //String 1aa; 안됨
        String a1a;

        //이름에 빈칸 사용할 수 없다.
        //String hello World; 안됨

        //대소문자 구분
        String aaa;
        String aAa;
        String aaA;

        //예약어 사용 금지 (파란색상 단어는 예약어)
        //String public;
        String pUblic;

        //상수는 전부 대문자, 스네이크 케이스 기법
        final int MY_NUM = 10;
        // NUM = 20;
        // 상수는 실행되고나면 절대 변하지 않는값. 실수하지 않기위해 final int 고정!, 실행속도가 빠르게떄문에 사용



        
    }
}
