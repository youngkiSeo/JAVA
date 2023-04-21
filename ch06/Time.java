package com.green.java.ch06;

public class Time {
    //전역변수
    private int hour;
    private int minute;
    private int second; //private 외부에서 접근금지


    public int getHour() { //지역변수
        return hour;
    }

    public void setHour(int hour) { //parameter 매게변수
        if(hour<24 && hour>0) {
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
