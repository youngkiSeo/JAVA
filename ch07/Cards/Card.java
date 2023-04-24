package com.green.java.ch07.Cards;

public class Card {
    static final String[] KINDS = {"CLOVER", "HEART","DIAMOND","SPACE"};
    static final int NUM_MAX =13; //무늬별 카드 수

    String kind; // 무늬
    String num; //번호

    //외부에서 무늬, 번호 값을 받아서 나의 멤버 필드 무늬와 번호에 대입하는 생성자 만들어주세요.

    public Card(String kind, String num) {
        this.kind = kind;
        this.num = num;
    }


    public static void main(String[] args) {
        CardDeck CD =new CardDeck();
        System.out.println(CD.cards);
    }
    @Override
    public String toString(){
        return "kind:" + kind + "num: " + num;
    }



}
