package com.thinlk.threadAtom;

public class MyAtomDemo implements Runnable{

    private int count = 0;
    private Object lock = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (lock) {
                count++;
                System.out.println("送个女孩第"+count +"个冰淇淋");
            }
        }
    }
}
