package com.green.java.practice;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "010-7307-2872";
        return phoneNumber;
    }

    public static String getAddress() {
        return "대구 어딘가";
    }
    public static String getHobby() {
        return "테니스";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("나의 전화번호: " + contactNumber);

        String address = getAddress();
        System.out.println("나의 주소는: " + address);

        String hobby = getHobby();
        System.out.println("나의 취미는: " + hobby);


    }
}

