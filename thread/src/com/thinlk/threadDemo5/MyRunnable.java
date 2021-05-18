package com.thinlk.threadDemo5;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    private int ticketCount = 100;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true) {
            try {
                lock.lock();
                if (ticketCount == 0) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName()+ "还剩" + ticketCount+ "张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
