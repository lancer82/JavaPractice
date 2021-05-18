package com.thinlk.threadDemo7;

public class Fooder extends Thread{

    @Override
    public void run() {
        while (true){
            synchronized(Desk.lock) {
                if (Desk.count == 0 ){
                    break;
                } else {
                    if (Desk.flag) {
                        System.out.println("吃汉堡包");
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
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
