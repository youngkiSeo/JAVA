package com.green.java.ch07.abstract2;

public abstract class abstractStudy1 {
    //선언부만 있는 메소드만 추상메소드
    //추상메소드가 있으면 class는 abstract 추상클래스를 사용해야한다
    //객체화가 안된다 그 자식들은 오버라이딩을 무조건 해야함


    int multi(int n1, int n2){
        return n1 * n2;
    }

    abstract void sum (int n1, int n2);
    //오버라이딩 강제로 해야함
}

class ChildClass extends abstractStudy1{

    @Override
    void sum(int n1, int n2) {
        System.out.println("합계: " +(n1 + n2));
    }
}
class Child2Class extends abstractStudy1{
    @Override
    void sum(int n1, int n2) {
        System.out.println("sum: " +(n1 + n2));
    }
}
