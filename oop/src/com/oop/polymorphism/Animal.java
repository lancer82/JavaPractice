package com.oop.polymorphism;

import java.awt.*;

public class Animal {
    int foot = 4;
    public void eat() {
        System.out.println("动物吃食物");
    }
}




class AnimalTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        Animal a = new Cat();
        /*成员变量：编译时父类，运行时父类
          成员方法：编译是父类，运行时子类；
        * */
        System.out.println(a.foot);//4
        a.eat(); //打印猫吃鱼

    }
}