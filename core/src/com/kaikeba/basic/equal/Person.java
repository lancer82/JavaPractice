package com.kaikeba.basic.equal;

import java.util.Objects;

/**
 * @author Thinlk
 * @create 2021-01-05 8:48 PM
 **/
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        //1、判断比较两个对象是否相等，如果引用相等则表示是同一个对象；
        if (this == obj) {
            return true;
        }
        //2、如果对象为空或者比较类不是同一个类则返回false，用于严格意义上的比较
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        //3、如果对象为空或者当前类及其子类都有统一的定义，那么使用以下凡是比较
//        if(!(obj instanceof Person)) {
//            return false;
//        }
        Person p = (Person) obj;
        //return p.getName().equals(this.getName()) && p.getAge() == this.getAge();
        return Objects.equals(this.name,p.name) && this.age == p.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Tom", 39);
        Person p2 = new Person("Tom", 28);
        System.out.println("p1.equals(p2):" + p1.equals(p2)); //false
        Person p3 = new Person("Tom", 28);
        System.out.println("p3.equals(p2):" + p3.equals(p2)); //true
        System.out.println(p3);
    }
}
