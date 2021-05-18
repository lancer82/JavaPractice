package com.thinlk.countDown;

import java.util.concurrent.CountDownLatch;

public class MatherThread extends Thread{
    private CountDownLatch countDownLatch;

    public MatherThread (CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("妈妈收拾碗筷");
    }
}
