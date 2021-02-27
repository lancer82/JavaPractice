package com.oop.abstract1;

/**
 * @author Thinlk
 * @create 2020-12-25 3:38 PM
 **/
abstract class Person {
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void eat();

    void walk() {
        System.out.println("走路");
    }
}

