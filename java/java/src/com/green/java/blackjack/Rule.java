package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Rule {

    Rule(){

    }

    public static int getScore(List<Card> cards){
        int num=0;
        for (Card card : cards) {
            num+=getDenominationNum(card.getDenomination());
        }
       return num;
    }

    public static int getDenominationNum(String card){
        int num=0;
        switch (card){
            case "A":
                return 1;
            case "J": case"Q": case "K":
                return 10;
            default:
                return Integer.valueOf(card);
        }
    }
    public  static void whoIsWin(Gamer gamer, Dealer dealer){
        int gscore=gamer.getPointSum();
        int dscore=dealer.getPointSum();
        int blackjackscore=21;


        if (gscore>21 && dscore>21){
            System.out.println("비김!");
        } else if (gscore>21) {
            System.out.println("딜러 승!");
        } else if (dscore>21||gscore>dscore) {
            System.out.println("게이머 승!");
        } else if (dscore>gscore){
            System.out.println("딜러 승!");
        } else {
            System.out.println("비김!");
        }



    }
}
