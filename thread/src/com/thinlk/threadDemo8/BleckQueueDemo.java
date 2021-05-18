package com.thinlk.threadDemo8;

import java.util.concurrent.ArrayBlockingQueue;

public class BleckQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        arrayBlockingQueue.put("汉堡包");

        System.out.println(arrayBlockingQueue.take());

        System.out.println("Complete----");
    }
}
