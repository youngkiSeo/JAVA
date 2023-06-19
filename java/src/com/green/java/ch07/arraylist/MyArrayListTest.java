package com.green.java.ch07.arraylist;

import java.util.ArrayList;


public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println(myList);


        myList.add(4, 100);
        System.out.println(myList);

        System.out.println(myList.size());

        //System.out.println(myList.toString()); //재정의를 해주지 않으면 Object에 toString모드가 호출됨
        //[10, 20, 30]

        for (int i = 0; i < myList.size(); i++) {
            int v1 = myList.get(i);
            System.out.println(v1);
        }

        System.out.println("------------------");
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }
        System.out.println(sum);
    }
}






