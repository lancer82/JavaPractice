package com.thinlk.threadDemo2;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("女神---"+i);
        }
    }
}
