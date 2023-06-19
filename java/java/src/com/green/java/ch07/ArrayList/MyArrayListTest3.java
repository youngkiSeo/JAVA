package com.green.java.ch07.ArrayList;

public class MyArrayListTest3 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.set(2,50);

        System.out.println(list);
        boolean r1 = list.contains(20);
        boolean r2 = list.contains(100);
        System.out.println("r1: "+r1+" r2: "+r2);

    }
}
