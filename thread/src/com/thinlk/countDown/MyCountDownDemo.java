package com.thinlk.countDown;

import java.util.concurrent.CountDownLatch;

public class MyCountDownDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        MatherThread mt = new MatherThread(countDownLatch);
        mt.start();

        ChildThread1 childThread1 = new ChildThread1(countDownLatch);
        childThread1.setName("小明");
        ChildThread2 childThread2 = new ChildThread2(countDownLatch);
        childThread2.setName("小白");
        ChildThread3 childThread3 = new ChildThread3(countDownLatch);
        childThread3.setName("小黑");

        childThread1.start();
        childThread2.start();
        childThread3.start();
    }
}
