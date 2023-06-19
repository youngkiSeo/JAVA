package com.green.java.ch04;

//p.137
public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;

        System.out.printf("x = %d 일 때, 참인 것은 \n", x);


        if( x == 0 ) { System.out.println("x == 0"); } // if문 뒤에는 boolean만 올수있음
        if( x != 0 ) { System.out.println("x != 0"); }
        if( !(x == 0) ) { System.out.println("!(x == 0)"); }
        if( !(x != 0) ) { System.out.println("!(x != 0)"); } // 이렇게 쓰는 경우 거의 없음
    }
}