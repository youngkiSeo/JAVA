package com.green.java.ch07.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(30);

        myList.add(90,100);

        System.out.println(myList.toString());
        System.out.println(myList.size()+"개");

        int v1= myList.get(0);
        System.out.println(v1);

        int sum=0;

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i)+" ");
            sum+= myList.get(i);
        }
        System.out.println();
        System.out.println("------------");
        System.out.printf("sum: %d",sum);
    }
}
