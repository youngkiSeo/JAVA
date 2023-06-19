package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2= null;

        fc.water();
        car = (Car) fc; //부모타입인 car는 자식인 fc의 주소값을 저장 할 수 있다.

        if(car instanceof  FireCar){
            fc2 = (FireCar) car;
            fc2.water();
        }else {
            System.out.println("안돼");
        }
        //car.water(); // 객체는 알고있는 메소드만 호출할수있음 다형성
        fc2=(FireCar)car; // car를 fc2의 FireCar로 형변환해줘야함
    }
}
class Car{
    void drive(){
        System.out.println("drive, Brrrrr~");
    }
    void stop(){
        System.out.println("stop!!!!");
    }
}

class FireCar extends Car{
    void water(){
        System.out.println("water!!!!");
    }
}
