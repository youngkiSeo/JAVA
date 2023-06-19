package com.green.java.builder;

// cc값만 넣고 객체 생성하고 싶다.
// cc값이랑 brand 값만 넣어서 객체 생성하고 싶다.
// cc 값과 model 값만 넣어서 객체 생성하고 싶다.
// cc 값과 seatCnt 값만 넣어서 객체 생성 하고 싶다.
// cc 값과 brand,model 값만 넣어서 객체 생성 하고 싶다.
// cc 값과 brand,seatmodel 값만 넣어서 객체 생성 하고 싶다.
// 원하는 값만 넣어서 객체 생성할수 있는게 builder 임

public class Car {
    private int cc;
    private String brand;
    private String model;
    private int seatCnt;

    public static class Builder{ //이너클래스
        private int cc;
        private String brand;
        private String model;
        private int seatCnt;

        public Builder cc(int cc){
            this.cc = cc;
            return this;
        }
        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }
        public Builder model(String model){
             this.model = model;
             return this;
        }
        public Builder seatCnt(int seatCnt){
            this.seatCnt = seatCnt;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
    public static Builder builder(){
        return new Builder();
    }
    private Car(Builder builder){
        this.cc = builder.cc;
        this.brand = builder.brand;
        this.model = builder.model;
        this.seatCnt = builder.seatCnt;
    }

    public int getCc() {
        return cc;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatCnt() {
        return seatCnt;
    }

    @Override
    public String toString(){
        return String.format("cc:%d,brand:%s,model:%s,seatCnt:%d",cc,brand,model,seatCnt);
    }
}
