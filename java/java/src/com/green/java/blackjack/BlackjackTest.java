package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        Rule rule1=new Rule();
        for (int i = 0; i <2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }
        if (dealer.isReceiveCard()){
            dealer.receiveCard(cd.getCard());
        }
        int gamerscore =rule.getScore(gamer.openCards());
        System.out.println("gamer: "+ gamerscore);

        int dealerscore =rule.getScore(dealer.openCards());
        System.out.println("dealer: "+dealerscore);
        gamer.showCards();

        while(true){
            String str="";
            System.out.println("Card More? (Y/N)");
            str=scan.nextLine();
            //if(str.equalsIgnoreCase("N")){
            if("n".equals(str.trim().toLowerCase())){
                break;
            }
            gamer.receiveCard(cd.getCard());
            gamer.showCards();
        }
        System.out.println("-----딜러카드----");
        dealer.showCards();
        Rule.whoIsWin(gamer,dealer);

    }
}