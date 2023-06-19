package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1, 100); //(1, 100) 1번자리에 100을 넣겠다. 자리가 뒤로 다 밀려남.
        list.add(0, 300);
        System.out.println(list);

        int removeValue = list.remove(4);// list.remove(4) 4번방을 지우고, 값을 리턴하겠다.
        System.out.println("removeValue : " + removeValue);
        System.out.println(list);

        System.out.println(list.size());
        //(list.size()); 길이, Array이라치면 leangth.


    }
}
//ArrayList<Integer> list = new ArrayList<>();
//list.add(10);
//list.aa(0,100);
//sout(list) // 0번방 100이나옴.

//int removeValue = list.remove(4);
//sout("removeValue: emoveValue);
//sout(list)l // 4번방 값이 지워지고 출력이된다.