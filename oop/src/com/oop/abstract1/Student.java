package com.oop.abstract1;

/**
 * @author Thinlk
 * @create 2020-12-25 3:58 PM
 **/
public class Student extends Person {

    public Student(String name, int age){
        super(name,age);
    }

    @Override
    void eat() {
        System.out.println("学生吃饭");
    }
}
