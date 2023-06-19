package com.green.java.ch07.Cards;

import com.green.java.ch07.ModifierTest;

public class CardTest {
    public static void main(String[] args) {
        ModifierTest mt1 =new ModifierTest();
//        mt1.num1=10;
//        mt1.num2=20;
//        mt1.num3=30;
        mt1.num4=40;

        CardDeck cd = new CardDeck();
        cd.openCards();
        cd.shuffle();
        cd.openCards();


        for (int i = 0; i <cd.cards.length; i++) {
            cd.pick();
        }
        System.out.println("--------");
        cd.pick();

        //Card c1 = cd.pick();
        //System.out.println(c1.kind +", " + c1.num);

        System.out.println("----------");
        cd.openCards();
    }
}
