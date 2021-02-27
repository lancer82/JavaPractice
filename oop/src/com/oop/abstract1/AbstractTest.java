package com.oop.abstract1;

/**
 * @author Thinlk
 * @create 2020-12-25 3:37 PM
 **/
public class AbstractTest {
    //  Person 类抽象了，就不可实例化了
    //  Person p1 = new Person();
    public static void main(String[] args) {

        Student student = new Student("张三",21);
        student.eat();
    }
}
