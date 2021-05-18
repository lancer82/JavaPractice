package com.thinlk.threadDemo2;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
