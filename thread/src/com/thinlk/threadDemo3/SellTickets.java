package com.thinlk.threadDemo3;

public class SellTickets extends Thread{
    private static int ticketCount = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if(ticketCount <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖票了，正在出售第"+ticketCount+"张票");
                    ticketCount--;
                }
            }
        }
    }
}
