package com.green.java.ch07.Poly;

public class Poly {
    /*
        1.부모타입은 자식 객체 주소값 저장할 수 있다.
        2.자식타입은 무보객체 주소값 저장 할 수 없다.
        3.타입은 (알고 있는 메소드만 호출할 수 있음)
                (메소드를 호출할 수 있나 없나만 결정)>>
                실제 실행되는 건 객체 기준이다.
     */
    public static void main(String[] args) {
        Animal ani1 = (Animal) new Dog(); //상속관계
        ani1.crying();

        //Animal dog2 = new Animal();
        Dog dog1 = (Dog) ani1;
        dog1.crying();
        dog1.Jump();
    }
}