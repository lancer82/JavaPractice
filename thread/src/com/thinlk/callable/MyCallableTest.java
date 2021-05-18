package com.thinlk.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable cb = new MyCallable();

        FutureTask<String> task = new FutureTask<>(cb);

        Thread t = new Thread(task);
        t.start();
        System.out.println(task.get());

    }
}
