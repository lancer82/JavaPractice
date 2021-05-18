package com.thinlk.semophere;

import java.util.concurrent.Semaphore;

public class MySemaphoreDemo implements Runnable{

    private Semaphore sph = new Semaphore(2);
    @Override
    public void run() {
        try {
            sph.acquire();
            System.out.println("获得了通行证开始行使");
            Thread.sleep(1000);
            System.out.println("归还通行证");
            sph.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
