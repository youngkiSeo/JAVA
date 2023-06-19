package com.green.java.ch07.ArrayList;

import java.util.Arrays;

public class MyArrayList {
    private int [] items;


    MyArrayList(){
        this.items= new int[0] ;
       // System.out.println(items.length);
    }


    public void add(int num) {
        int [] temp = new int [items.length+1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[items.length]= num;
        items=temp;
    }
    public void add(int num1, int num2){
        int [] temp = new int[items.length+1];

//        for (int i = 0; i <=items.length; i++) {
//            if (i < num1) {
//                temp[i] = items[i];
//            } else if (i == num1) {
//                temp[i] = num2;
//            } else {
//                temp[i] = items[i - 1];
//            }
//        }

        if (num1>items.length){
            System.out.println("오류발생");
            return;
        }

        temp[num1]=num2;
        for (int i = 0; i<items.length; i++) {
            if (i < num1) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items=temp;
    }
    @Override
    public String toString(){
        String str = "["+items[0];
        for (int i = 1; i <items.length; i++) {
            str+=", "+items[i];
        }
        str+="]";
        return str;
    }
    public int size(){
        return items.length;
    }


    public int get(int i) {
        return items[i];
    }

    public void bubbleStart() {
        int num = 0;
        System.out.println(Arrays.toString(items));
        for (int i = 0; i <items.length; i++) {
            for (int z = 0; z < i; z++) {
                if (items[z] > items[z+1]) {
                    num = items[z];
                    items[z]=items[z+1];
                    items[z+1]=num;
                    System.out.println(Arrays.toString(items));
                }
            }
        }
        System.out.println(Arrays.toString(items));

    }

    public void set(int num1,int num2){
        this.items[num1]=num2;
    }
    public boolean contains(int num){
        for (int val:items) {
            if (val == num){
                return true;
            }
        }
        return false;
    }
}