package com.green.java.ch07.abstract2;

public interface Fightable {
    public abstract void sum (int x , int y);
    public abstract void move (int x , int y);
    //인터페이스는 무조건 추상메소드만 사용할수있어 abstract을 적지않아도 자동적용됨
    //인터페이스는 자동상속이 됨 내용이 없어서 문제가 없다
    //인터페이스 able
    //인터에피스는 부모로의 역할만하고 강제 오버라이딩해야함
}
