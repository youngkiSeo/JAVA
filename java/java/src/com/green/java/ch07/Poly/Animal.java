package com.green.java.ch07.Poly;

public class Animal {
    private String name;
    public Animal(){

    }
    public Animal(String name){
        this.name=name;
    }

    public void crying() {
        System.out.println("동물이 운다");
    }
}

class Dog extends Animal {

    public Dog() {
        super("바둑이");
    }
    public Dog(String name){
        super(name);
    }

    @Override
    public void crying(){
        //부모가 가지고 있는 메소드를 재정의 하는것
        System.out.println("멍멍");
    }
    public void Jump(){
        System.out.println("개가 점프!");
    }
}
class Bulldog extends Dog {
    public Bulldog() {
    }

    public Bulldog(String name) {
        super(name);
    }

    @Override
    public void crying(){
        System.out.println("으르렁~");
    }

}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void crying(){
        System.out.println("냐옹~");
    }

}

class Duck extends Animal {
    public Duck() {
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void crying(){
        System.out.println("꽥꽥~");
    }

}

