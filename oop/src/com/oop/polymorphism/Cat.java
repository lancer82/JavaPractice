package com.oop.polymorphism;

public class Cat extends Animal{

    int foot = 5;
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

}
