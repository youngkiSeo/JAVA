package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardDeck {
    public static final String [] PATTERNS = {"♦","♠","♣","♥"};
    public static final int CARD_COUNT =13;
    private List<Card> cardlist;

    public CardDeck() {
        this.cardlist = new ArrayList<>();
        for (String pattern: PATTERNS) {
            for (int z = 1; z <= CARD_COUNT; z++) {
                this.cardlist.add(new Card(pattern,getDenomination(z)));

            }
        }
    }

    private String getDenomination(int num){
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(num);
        }
    }

    public static void main(String[] args) {
          CardDeck cd = new CardDeck();
        cd.cardlist.remove(1);
        for (Card card: cd.cardlist) {
            System.out.print(card.getDenomination()+card.getPattern()+"  ");
        }
    }

    public Card getCard(){
        int rIdx=(int)(Math.random()*cardlist.size());
        return cardlist.remove(rIdx);
    }

    public void showSize(){
        System.out.println(cardlist.size());
    }
}