package com.thinlk.threadDemo3;

public class SellTicketTest {
    public static void main(String[] args) {
        SellTickets s1 = new SellTickets();
        SellTickets s2 = new SellTickets();

        s1.setName("窗口一");
        s2.setName("窗口二");

        s1.start();
        s2.start();
    }
}
