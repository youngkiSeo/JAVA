package com.green.java.ch07.Cards;

import static com.green.java.ch07.Cards.Card.NUM_MAX;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("-------");
        cd.shuffle();
        cd.openCards();

        Card c1 = cd.pick();
        System.out.println(c1.kind + ", " + c1.num);

        Card c2 = cd.pick();
        System.out.println(c1.kind + ", " + c1.num);

        Card c3 = cd.pick();
        System.out.println(c1.kind + ", " + c1.num);

        System.out.println("--------");
        cd.openCards();
    }
}