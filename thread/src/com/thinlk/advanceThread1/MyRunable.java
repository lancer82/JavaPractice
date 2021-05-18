package com.thinlk.advanceThread1;

public class MyRunable extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"在执行中");
    }
}
