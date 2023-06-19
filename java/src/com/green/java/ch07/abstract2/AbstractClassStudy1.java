package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {
    //class앞에 abstract붙이는것이 추상 클래스
    //추상메소드 앞에는 abstract 반드시 붙여줘야한다.
    //강제성이있다!! 반드시 오버라이딩해야하고 그 메소드가 부모까지(자식) 안올라오고 바로 실행된다.
    //무조건 자식이있다.
    //추상클래스가없는 클래스라도 앱스트랙트붙일수있다. 하지만 객체화가 안된다.
    //추상클래스는 단일 상속 안됨, 오직 인터페이스만 단일 상속 가능하다.

    int multi(int n1, int n2) {
        return n1 * n2;
    }
    abstract void sum(int n1, int n2); // 무조선 부모 역활해야함. 혼자 안됨

}

class ChildClass extends AbstractClassStudy1 {
    void sum(int n1, int n2) {
        System.out.println("합계 : " + (n1 + n2));

    }
}

class Child2Class extends AbstractClassStudy1 {
    void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));

    }
}