package com.green.java.practice;

public class _Quiz_05 {
    public static void main(String[] args) {
//신발사이즈는 250 - 295까지 5단위로증가
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size :
                sizeArray) {
            System.out.println("사이즈" + size + "(재고있음)");
        }

    }
}


//    int[] sizeArray = new int[10];
//        for (int i = 0; i < sizeArray.length; i++) {
//            sizeArray[i] = 250 + ( 5 * i );
//        }
//        for (int size :
//                sizeArray) {
//            System.out.println("사이즈" + size + "(재고있음)");

