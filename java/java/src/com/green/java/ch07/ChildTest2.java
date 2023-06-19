package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child ch = new Child(10);
        ch.age=20;

        System.out.println(ch.getSuperAge());
        System.out.println(ch.getThisAge());

        ch.toString();

    }
}