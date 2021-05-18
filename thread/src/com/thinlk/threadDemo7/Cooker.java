package com.thinlk.threadDemo7;

public class Cooker extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (!Desk.flag) {
                        System.out.println("生产汉堡包");
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
