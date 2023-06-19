package com.green.java.ch04.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class VendingMachine {
    private int money;
    private String [] menuNamesArr = {"콜라", "사이다", "환타", "미란다"};
    private int[] menuPriceArr = {1000,1500,2000,2500};
    private String [] shopping_basket = new String [10];
    private LinkedList<Integer> puchaseList = new LinkedList<>();


    public VendingMachine() {


    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public String[] getMenuNamesArr() {
        return menuNamesArr;
    }

    public void setMenuNamesArr(String[] menuNamesArr) {
        this.menuNamesArr = menuNamesArr;
    }

    public int[] getMenuPriceArr() {
        return menuPriceArr;
    }

    public void setMenuPriceArr(int[] menuPriceArr) {
        this.menuPriceArr = menuPriceArr;
    }

    public void insert(int money) {
        this.money += money;
    }
    public void showMenus(){

        System.out.println("번호 \t 메뉴명\t 가격");
        for (int i = 0; i < menuPriceArr.length; i++) {
            System.out.printf(" %d\t\t %s \t %d \n",i+1,menuNamesArr[i],menuPriceArr[i]);
        }

    }
    int idx2=0;
    public void purchaseDrink(int num){
        int idx = num-1;
        this.money-=menuPriceArr[num-1];
        System.out.printf("%s를 구매 하였습니다. 남은 잔액은 %,d입니다.\n", menuNamesArr[num-1],this.money);

            if(shopping_basket[idx2]==null) {
                shopping_basket[idx2++] = menuNamesArr[num - 1];
            }

            puchaseList.add(idx);

    }
    public void showMoney(){
        System.out.printf("현재 잔액은  %,d원입니다.\n",this.money);
    }

    public void showPurchaseList() {
        if (puchaseList.size()==0){
            System.out.println("제품을 구매하지 않았습니다.");
            return;
        }
        int idx = puchaseList.get(0);
        System.out.print(menuNamesArr[idx]);
        for (int i = 1; i <puchaseList.size(); i++) {
            idx = puchaseList.get(i);
            System.out.printf(", %s",menuNamesArr[idx]);
        }
        System.out.println("을(를) 구매 하였습니다");



        System.out.print("["+shopping_basket[0]);
        for (int i = 1; i <shopping_basket.length; i++) {
            if (shopping_basket[i]!=null){
                System.out.print(", "+ shopping_basket[i]);
            }else {
                continue;
            }
        }
        System.out.println("] 를 구매하였습니다");
    }
}