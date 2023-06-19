package com.green.java.ch07.abstract2;

public class FighterTest {
    public static void main(String[] args) {

        Fightable f1 = new Fighter();
        Fightable f2 = new Fighter();
        f1.sum(10,7);
        f2.sum(10,20);
        f2.move(10,20);


    }
}
