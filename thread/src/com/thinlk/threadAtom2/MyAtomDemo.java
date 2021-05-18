package com.thinlk.threadAtom2;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomDemo implements Runnable{

    AtomicInteger atom = new AtomicInteger();
//    private int count = 0;
//    private Object lock = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            synchronized (lock) {
                int count= atom.incrementAndGet();
                System.out.println("送个女孩第"+count +"个冰淇淋");
//            }
        }
    }
}
