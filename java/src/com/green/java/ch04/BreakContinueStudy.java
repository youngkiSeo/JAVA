package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i + ", ");

            if (i == 5) {
                System.out.println("\n5에서 끝!");
                break; // break: 가장 가까운 반복문을 빠져나오는것
            }
        }
        System.out.println("---------------");
        for(int i=0; i<10; i++) {
            if(i==5) {
                continue; // continue : skip! 바로 증감
            }
            System.out.print(i + ",");
            }
        }
    }

