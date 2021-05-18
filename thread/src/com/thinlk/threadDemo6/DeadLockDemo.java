package com.thinlk.threadDemo6;

public class DeadLockDemo {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        new Thread(() -> {
            while (true) {
                synchronized (obj1){
                    synchronized (obj2) {
                        System.out.println("小爱同学正在通过");
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (obj2){
                    synchronized (obj1) {
                        System.out.println("森瑞同学正在通过");
                    }
                }
            }
        }).start();
    }
}
