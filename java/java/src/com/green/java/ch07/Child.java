package com.green.java.ch07;

public class Child extends Parent {

    public Child(int age){
        super(); //슈퍼();
        this.age = age; //슈퍼 . : 맴버필드랑 맴버 메소드 읽기 쓰기
        // this(); 자기 자신의 생성자 호출할때 사용함
        System.out.println();
    }

    //Parent를 상속 받으면 age를 사용할수있음
    public Child(){
        System.out.println("-- Child 기본 생성자 --");
    }
    void play(){
        System.out.printf("%d살인 아이가 논다",age); //
    }

    public int getSuperAge(){
        return super.age;
    }
    public int getThisAge(){
        return this.age;
    }

}
