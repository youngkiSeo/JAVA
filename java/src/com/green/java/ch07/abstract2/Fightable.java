package com.green.java.ch07.abstract2;

public interface Fightable {
    //추상 메소드만 작성가능, 구현부가 있는 메소드 작성시 에러남
    //인터페이스 이름은 형용사로 끝난다 '~able'
    //인터페이스 이름 콤마 이름 콤마 하면 계속 상속받을수있다.
    void sum (int x, int y); //public abstract 자동으로 붙음.
    void move (int x, int y);

}
