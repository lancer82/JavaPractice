package com.thinlk.threadDemo4;

public class MyRunnable implements Runnable {
    private static int ticketCount = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if ("窗口一".equals(Thread.currentThread().getName())) {
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            }

            if ("窗口二".equals(Thread.currentThread().getName())) {
                synchronized (MyRunnable.class) {
                    if (ticketCount == 0) {
                       break;
                    }else{
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticketCount--;
                        System.out.println(Thread.currentThread().getName()+"还剩"+ticketCount+"张票");
                    }
                }
            }
        }
    }

    private static synchronized boolean synchronizedMethod() {
        if (ticketCount == 0) {
            return true;
        }else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName()+"还剩"+ticketCount+"张票");
            return false;
        }
    }
}
