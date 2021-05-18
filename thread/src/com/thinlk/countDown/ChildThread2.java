package com.thinlk.countDown;

import java.util.concurrent.CountDownLatch;

public class ChildThread2 extends Thread{
    private CountDownLatch countDownLatch;

    public ChildThread2 (CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(getName()+"在吃第"+i+"个饺子");
        }
        countDownLatch.countDown();
    }
}
