package com.green.java.ch07.Poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog("뽀삐");
        //Bulldog 객체를 Animal 타입의 anil 변수에 객체주소값을 저장
        boolean r1 = ani1 instanceof Bulldog;
        // ani1 객체 주소값을 Bulldog으로 형변환이 가능하면 true 아니면 false

        System.out.println("r1 : " + r1);

       System.out.println("r2: " + (ani1 instanceof  Cat));
       //상속관계가 아니라서 불가능 형제불가능
        //Cat c1 = (Cat) ani1;
    }
}

