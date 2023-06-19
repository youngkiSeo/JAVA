package com.green.java.ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println(p.x);
        p.method(); //메소드는 무조건 객체기준 Child2의 메소드 확인- 없으면 - 부모의 메소드 확인
        System.out.println(c.x);
        c.method();
    }
}
class Parent2{
    int x =100;
    void method(){
        System.out.println("Parent Method");
    }
}
class Child2 extends Parent2{
    int x =200;
    @Override //부모 메소드 오버라이딩 확인
    void method(){
        super.method(); // 둘다실행되야할때 사용
        System.out.println("Child Method");
    }
}