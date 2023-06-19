package com.green.java.ch06;

public class Child extends Parent{
    public Child(int age){
        super();
        this.age = age;
        System.out.println();
    }

    //Parent를 상속 받으면 age를 사용할수있음
    public Child(){
        System.out.println("-- Child 기본 생성자 --");
    }
    void play(){
        System.out.printf("%d살인 아이가 논다",age); //
    }


}
