package com.thinlk.threadDemo9;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    private ArrayBlockingQueue<String> list;

    public Foodie(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = list.take();
                System.out.println("从队列中取得"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
