package com.green.java.ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println(p.x);
        p.method();

        System.out.println(c.x);
        c.method();
    }
}
class Parent2 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}
class Child2 extends Parent2 {
    int x = 200;
    @Override //Override썼을때 효과: 이게 오버라이드가 맞는지 확인시켜주는 용도(꼭 쓸 필요는 없음)
    void method() { System.out.println("Child Method");
    }
}