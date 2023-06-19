package com.green.java.ch04.VendingMachine;

public class VendingMachineobjTest {
    public static void main(String[] args) {
        VendingMachineobj vm = new VendingMachineobj();
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.showMenus();
        vm.purchaseDrink(1);
        vm.purchaseDrink(2);
        vm.purchaseDrink(3);
        vm.purchaseDrink(1);
        vm.showMoney();

    }
}
