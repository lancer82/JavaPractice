package com.oop.innerclass;

public class InnerTest {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
        System.out.println(inner.num);

        System.out.println("**********************");

        Outer outer = new Outer();
        outer.accessInnerShow();
    }
}


class Outer {
    private int a = 10;

    class Inner {
        int num = 10 ;
        void show() {
            System.out.println("inner class show");
            //1、内部类可以直接访问外部类的成员属性和方法。包括私有。
            System.out.println(a);
        }
    }

    public void accessInnerShow() {
        //外部类访问成员内部类的非私有属性和方法，需要先创建对象。
        Inner inner = new Inner();
        inner.show();
    }
}
