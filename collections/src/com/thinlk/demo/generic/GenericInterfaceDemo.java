package com.thinlk.demo.generic;

public class GenericInterfaceDemo {

    public static void main(String[] args) {
        GenericInpl1<String> generic1 = new GenericInpl1<>();
        generic1.show("测试泛型接口");


        GerericImpl2 generic2 = new GerericImpl2();
        generic2.show(19);
    }





}

interface Generictity<T> {
    void show(T t);
}

class GenericInpl1<T> implements Generictity<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }

}

class GerericImpl2 implements Generictity<Integer> {

    @Override
    public void show(Integer integer) {
        System.out.println(integer);
    }
}