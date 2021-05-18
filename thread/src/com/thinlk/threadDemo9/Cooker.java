package com.thinlk.threadDemo9;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    private ArrayBlockingQueue<String> list;

    public Cooker(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                list.put("汉堡包");
                System.out.println("做好了一个汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
