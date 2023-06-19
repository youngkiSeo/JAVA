package com.green.java.blackjack;

public class Dealer extends User{
    private final int CAN_RECEIVE_POINT = 16;

    boolean isReceiveCard(){
        return getPointSum()<=CAN_RECEIVE_POINT;
    }
}
