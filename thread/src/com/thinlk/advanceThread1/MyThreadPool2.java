package com.thinlk.advanceThread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPool2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) service;

        System.out.println(pool.getPoolSize());
        service.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        service.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
        System.out.println(pool.getPoolSize());
        service.shutdown();
    }
}
