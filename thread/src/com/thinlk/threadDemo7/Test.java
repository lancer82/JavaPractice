package com.thinlk.threadDemo7;

public class Test {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Fooder fooder = new Fooder();

        cooker.start();
        fooder.start();
    }
}
