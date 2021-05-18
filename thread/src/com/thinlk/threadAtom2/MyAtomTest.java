package com.thinlk.threadAtom2;

public class MyAtomTest {
    public static void main(String[] args) {
        MyAtomDemo myAtomDemo = new MyAtomDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(myAtomDemo).start();
        }
    }
}
