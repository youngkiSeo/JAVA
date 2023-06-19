package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private ArrayList<Card>cardlist;

    User(){
        cardlist=new ArrayList<>();
    }

    public void receiveCard(Card c){
        this.cardlist.add(c);
    }
    public List<Card> openCards(){
        return cardlist;
    }

    protected int getPointSum(){
        return Rule.getScore(cardlist);
    }
    public void showCards(){
        System.out.printf("[현재 보유 카드 목록]\n");
//        for (int i = 0; i <cardlist.size(); i++) {
//            System.out.printf("Card { %s, %s }\n",cardlist.get(i).getPattern(),cardlist.get(i).getDenomination());
//        }
        for (Card card:cardlist) {
            System.out.println(card);
        }

    }
}
