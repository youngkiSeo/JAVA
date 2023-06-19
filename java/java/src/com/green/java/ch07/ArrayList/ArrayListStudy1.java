package com.green.java.ch07.ArrayList;

import java.util.*;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList(); //배열 읽기만하면 arraylist
        LinkedList linkedList = new LinkedList<>(); // 모드로 처리함 수정이 많으면 링크드리스트가 편리함

        ArrayList arraylist = new ArrayList();
        arraylist.add(10); // 0번방
        arraylist.add(20);// 1번방
        arraylist.add("ddd"); // Object타입은 정수값도, 문자열도 아무거나 다들어감

        Object obj = 10; //Object 타입은 숫자도 저장할수있음

        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(2));

        int n1 = (int)arraylist.get(0);  //Object타입이라서 object 타입으로 뱉어내기 때문에 강제 형변환을 해줘야함
        int n2 = (int)arraylist.get(1);
        String str1 = (String)arraylist.get(2);
        ArrayList<String> strlist= new ArrayList<>();

        strlist.add("0번방");
        strlist.add("1번방");
        strlist.add("2번방");
        strlist.add("3번방");
        System.out.println(strlist);
        System.out.println("shuffle 중...");
        Collections.shuffle(strlist);
        System.out.println(strlist);

        for (Object i:arraylist) {
            System.out.println("i: "+i);
        }
    }
}