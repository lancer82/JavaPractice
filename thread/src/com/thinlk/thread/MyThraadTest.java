package com.thinlk.thread;

public class MyThraadTest {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("睡觉了");
        Thread.sleep(3_000);
        System.out.println("睡醒了");

        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread("坦克");
        MyThread t2 = new MyThread("飞机");
        t1.setName("贝塔");
        t2.setName("舒克");

        t1.start();
        t2.start();
    }
}
