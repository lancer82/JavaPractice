package com.thinlk.semophere;

public class MySemaphoreTest {
    public static void main(String[] args) {
        MySemaphoreDemo mySemaphoreDemo = new MySemaphoreDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(mySemaphoreDemo).start();
        }
    }
}
