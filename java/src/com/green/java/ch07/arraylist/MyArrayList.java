package com.green.java.ch07.arraylist;

import java.util.ArrayList;


public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
        //System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1]; // 방 갯수: 첫방이 0이니까 1을더해줘서 1번방을 만들어준다.
        temp[items.length] = value; // 방을 임의로 설정
        for (int i = 0; i < items.length; i++) { //방안의 값을넣어주고
            temp[i] = items[i]; //
        }
        items = temp;//주소값을 복사해준다.
    }

    public void add(int idx, int value) {
        if (idx > items.length) {
            return;
        }

        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items = temp;
    }

    public int size() {
        return items.length;
        //public int size() {
        //return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }

    public void bubbleSort() {
        for (int i = items.length - 1; i > 0; i--) {   //5>4>3>2>1 돌린다
            for (int z = 0; z < i; z++) { // 0>1>2>3>4>5
                int sideIdx = z+1;
                if (items[z] > items[sideIdx]) {
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                }

            }
        }
    }

            @Override
            public String toString () {
                String str = "[";
                if (items.length > 0) {
                    str += items[0];
                    for (int i = 1; i < items.length; i++) {
                        str += ", " + items[i];
                    }
                }
                str += "]";
                return str;
            }
        }


//
//    void print() {
//        for (int i : items) {
//            System.out.println(i);

