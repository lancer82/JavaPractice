package com.thinlk.runnable;

public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);

        Thread t1 = new Thread(mr,"坦克");
        Thread t2 = new Thread(mr,"飞机");

        t1.start();
        t2.start();
    }
}
