package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = a;


        double d = 10.2;
        Double d2 = d;

        //generic 제네릭
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> List = new ArrayList<();
        //<타입> 타입을 치면 해당하는 타입만 입력되고 출력된다.
        //list.add("11");
        //list.add("10.1");
        //list.add("true");
        //list.aa(1);
        list.add(10); //정수형만 사용 가능
        list.add(13);

        int n1 = list.get(0);
        System.out.println(list); //투스트링이 오버라이딩 되어있음
        //int n1 = list.get(0);
        //sout(list);
    }
}
