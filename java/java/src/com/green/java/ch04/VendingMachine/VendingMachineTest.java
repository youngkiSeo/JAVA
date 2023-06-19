package com.green.java.ch04.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.insert(10000);
        vm.setMoney(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMenus();
        vm.purchaseDrink(1);
        vm.purchaseDrink(1);
        vm.purchaseDrink(2);

        vm.showPurchaseList();

        vm.showMoney();





    }
}
