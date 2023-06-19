package com.green.java.ch07.abstract2;

public class AbstractClassTest1 {
    public static void main(String[] args) {
        //AbstractClassStudy1 acs1 = new AbstractClassStudy1(); 추상클래스는 객체화를 할수없다.
        AbstractClassStudy1 acs1 = new ChildClass();
        acs1.sum(10, 20);

        AbstractClassStudy1 acs2 = new ChildClass();
        acs1.sum(10, 20);

    }
}
