package com.thinlk.threadDemo10;

public class MyAtomDemo implements Runnable{

    private int count = 0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("送个女孩第"+count +"个冰淇淋");
        }
    }
}
