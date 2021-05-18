package com.thinlk.threadDemo9;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        Cooker cooker = new Cooker(list);
        Foodie foodie = new Foodie(list);

        cooker.start();
        foodie.start();
    }
}
