package com.thinlk.countDown;

import java.util.concurrent.CountDownLatch;

public class ChildThread1 extends Thread {
    private CountDownLatch countDownLatch;

    public ChildThread1 (CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName()+"在吃第"+i+"个饺子");
        }
        countDownLatch.countDown();
    }
}
