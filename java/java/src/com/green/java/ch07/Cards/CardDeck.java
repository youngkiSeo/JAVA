package com.green.java.ch07.Cards;

public class CardDeck {
        Card[] cards;
    int idx =0;

    public CardDeck() { //카드댁의 기본 생성자
        int idx =0;
        cards= new Card[52];
        //Card.KINDS 맴버필드다, 상수다, static이다
            for (int i = 0; i < Card.KINDS.length; i++) {
                for (int z = 1; z <=Card.NUM_MAX; z++) {
                    String num =null;
                    switch (z){
                        case 1:
                            num="A";
                            break;
                        case 11:
                            num="J";
                            break;
                        case 12:
                            num="Q";
                            break;
                        case 13:
                            num="K";
                            break;
                        default:
                            num= String.valueOf(z);
                    }
                    cards[idx++] = new Card(Card.KINDS[i],num);
                }
            }
        }
    public void openCards(){
        for (Card c: cards) {
            //System.out.println(c.kind + ", "+c.num);
            System.out.println(c); //객체의 해쉬코드값이 찍힘 //object 값
        }
    }
    public void shuffle(){
        for (int i =0; i <cards.length; i++) {
            int rand = (int)(Math.random()*cards.length);
            if(i==rand) {
                continue;
            }
            Card Temp = cards[i];
            cards[i]= cards[rand];
            cards[rand]=Temp;
        }
    }
    public Card pick(){
        if (idx==cards.length) {
            return null;
        } //예외처리가 발생되지 않도록 try cach 문사용x
            Card Temp= cards[idx];
            cards[idx++]= null;
            return Temp;
    }
}