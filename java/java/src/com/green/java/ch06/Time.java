package com.green.java.ch06;

public class Time {
    //전역변수
    private int hour;
    private int minute;
    private int second; //private 외부에서 접근금지 맴버필드는 무조건 private
    //상수만 public 사용할수있음
    //생성자를 이용하여 값을 넣을 수 있다.
    // 메소드를 통해서 값을 넣을수있다. 그 메소드 이름이 setter
    // 값을 빼는것은 메소드를 통해서 getter


    //ublic int test() {int gg =10;}
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
