package com.green.java.ch07.abstract2;

public class abstractClassTest1 {
    public static void main(String[] args) {

    //abstractStudy1 abstractStudy1 = new abstractStudy1();
        abstractStudy1 acs1 = new ChildClass();
        abstractStudy1 acs2 = new Child2Class();
        acs1.sum(10,20);
        acs2.sum(10,20);

    }

}
