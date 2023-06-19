package com.green.java.ch06;

public class Time {
    private int hour;
    private int minute;
    private int second;
    //멤버필드는 무조건 프라이빗
    //외부에서 접근 불가
    //프라이빗 값 넣는법: 1.생성자를 이용(최초 생성시만 이용가능), 2.seter 메소드를 이용해서
    //값을 뺴는 법: 1. 메소드를 이용해서 뺄수있음
    //hour - gethour,sethour 한개씩 총 두개 생성가능

    public void test() {
        int gg = 10;
    } //상수만 퍼블릭 줄수있음
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if(hour > 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}