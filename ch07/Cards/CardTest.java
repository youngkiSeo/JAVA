package com.green.java.ch07.Cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        cd.shuffle();
        cd.openCards();

        Card c1 = cd.pick();
        System.out.println(c1.kind +", " + c1.num);

        Card c2 = cd.pick();
        System.out.println(c2.kind +", " + c2.num);


        System.out.println("----------");
        cd.openCards();



    }

}
