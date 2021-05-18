package com.thinlk.advanceThread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        service.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
        Thread.sleep(2000);
        service.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        service.shutdown();

    }
}
