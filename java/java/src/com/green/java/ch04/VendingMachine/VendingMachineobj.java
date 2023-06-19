package com.green.java.ch04.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineobj {
    private int money;
    private ArrayList<String> shopping_basket = new ArrayList<>();
    private List<Drink> list = new ArrayList<>();

    VendingMachineobj(){
        list = new ArrayList<>();
        list.add(new Drink(1000,"콜라","코카콜라",500));
        list.add(new Drink(1500,"사이다","칠성",450));
        list.add(new Drink(2000,"환타","코카콜라",500));

    }

    public void insert(int money){
        this.money+=money;
    }

    public void showMenus(){
        System.out.println("번호 \t 메뉴명 \t 가격 \t\t  회사 \t\t 용량");

        for (int i = 0; i <list.size(); i++) {
            System.out.printf("%2d \t\t %s \t %d원 \t %5s \t%4dml \n",i+1,list.get(i).getNm(),list.get(i).getPrice(),list.get(i).getCompany(),list.get(i).getMl());
        }
    }

    public void purchaseDrink(int num){
        Drink drink = list.get(num-1);
        System.out.printf("%s을 구매 하였습니다.\n",drink.getNm());
        money-=drink.getPrice();
        shopping_basket.add(drink.getNm());
    }

    public void showMoney(){
        System.out.printf("장바구니 목록: [%s",shopping_basket.get(0));
        for (int i = 1; i <shopping_basket.size(); i++) {
            System.out.printf(", %s",shopping_basket.get(i));
        }
        System.out.println("]");

        System.out.printf("현재 잔액은: %,d원 입니다",this.money);
    }
}
