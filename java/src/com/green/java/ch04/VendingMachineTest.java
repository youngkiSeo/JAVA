package com.green.java.ch04;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        // 'vm' = 밴딩머신 객체의 주소값을 받을수있음.
        // 주소값이 없을때만 null
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000); // static 안붙어있으면 void타입..


        vm.showMenus();
        vm.purchaseDrink(1);
        vm.purchaseDrink(1);
        vm.purchaseDrink(1);
        //vm.purchaseDrink(1);
        //콜라를 구매하였습니다. (money값은 - 1000처리)
        // vm에 showMuenus를 호출
        //외롭게 혼자 있을경우 void일 가능성이 굉장히 큼
        /*
        번호 \t 메뉴명\t 가격
        번호 \t 메뉴명\t 가격
        1.\t 콜라 \t 1,000원
        2.\t 사이다 \t 1,500원
        3.\t 환타 \t 2,000원
        4.\t 미란다 \t 2,500원
         */

        vm.showPurchaseList(); //콜라, 콜라, 콜라을(를) 구매하였습니다.
        vm.showMoney(); // 현재 잔액은 30,000원입니다.



    }
}
