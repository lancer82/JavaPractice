package com.thinlk.threadAtom;

public class MyAtomTest {
    public static void main(String[] args) {
        MyAtomDemo myAtomDemo = new MyAtomDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(myAtomDemo).start();
        }
    }
}
