package com.green.java.ch03; // p.105

public class OperatorEx18 {
    public static void main(String[] args) {
       double pi = 3.141592;
       double shortPi = Math.round(pi * 1_000) / 1_000.0;
       // 문자열과 소괄호가 같이있을경우 '메소드' 메소드는 실수를 반올림해주고 실수를 올리고 내려준다
        System.out.println(shortPi);

        System.out.println(Math.round(315.4)); // 315
        System.out.println(Math.round(315.5)); // 316 반올림 롱타입
        System.out.println(Math.ceil(315.1)); // 316.0 올림 더블타입
        //페이징 처리할때  ex: 게시글이 51개라 가정하고 한페이지당 50개씩 나타낼수있을때, 올림해서 페이지 2개를 만들수있다.
        System.out.println(Math.floor(315.9)); // 315.0 내림 더블타입
        // void는 혼자 외롭게 있어야함!! 괄호안에 못들어감


    }
}
