package com.green.java.ch07.Poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("뽀삐");

        Bulldog bd1= new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        anmailCryingCall(dog1);
        anmailCryingCall(bd1);
        anmailCryingCall(cat1);
        anmailCryingCall(duck1);
    }
     static void anmailCryingCall(Animal animal){
        animal.crying();
        //animal이 Dog의 instance인지 판단 할때 사용됨
         //보통 boolean 타입으로 true false 반환함
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.Jump();
        }
    }
}

