package com.green.java.ch07.poly;

import java.sql.SQLOutput;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog; //Instanceof: 형변환이 가능한지 판별
        System.out.println("r1 : " + r1);
        Bulldog bd1 = (Bulldog) ani1;

        System.out.println("r2 : " + (ani1 instanceof Cat)); //형변환은 상속관계끼리 가능함.
        //Cat c1 = (Cat)ani1;

    }
}