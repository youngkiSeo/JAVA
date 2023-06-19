package com.green.java.ch07.abstract2;

public class Fighter implements Fightable, Runable{
    @Override
    public void sum(int x, int y) {
        System.out.println("파이터 sum: " + (x+y));

    }
    @Override
    public void fly(){

    }

    @Override
    public void run() {

    }

    @Override
    public void move(int x, int y) {
        System.out.printf("좌표 %d, %d로 이동 \n",x,y);

    }
}
class Fighter2 implements Fightable{

    @Override

    public void sum(int x, int y) {

    }

    @Override
    public void move(int x, int y) {
        System.out.printf("좌표 %d, %d로 이동 \n",x,y);

    }
}
