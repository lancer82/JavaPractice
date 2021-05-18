package com.thinlk.threadDemo1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallableTest {

    public static void main(String[] args) {
        MyCallable mc1 = new MyCallable();
        FutureTask<String> ft1 = new FutureTask<>(mc1);
        Thread t1 = new Thread(ft1);
        t1.setName("飞机");
        t1.setPriority(10);
        System.out.println(t1.getPriority());


        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread t2 = new Thread(ft2);
        t2.setName("坦克");
        t2.setPriority(1);
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}
