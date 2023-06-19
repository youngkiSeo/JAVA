package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,100); //1번자리에 100을 넣겠다
        list.add(0,300); //1번자리에 100을 넣겠다
        System.out.println(list);
        int removeValue = list.remove(4);
        System.out.println(list+ "removeValue: " + removeValue);
        System.out.println(list.size());
        list.clear();//전체삭제
    }
}
