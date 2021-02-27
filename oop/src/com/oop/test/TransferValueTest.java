package com.oop.test;

/**
 * @author Thinlk
 * @create 2020-12-11 10:59 PM
 **/
public class TransferValueTest {

    public static void main(String[] args) {
        TransferValueTest transferValueTest = new TransferValueTest();
        transferValueTest.first();

    }
    public void first() {
        int i = 5;
        Value value = new Value();
        value.i = 25;
        secoud(value,i);
        System.out.println(value.i);
    }
    public void secoud(Value value, int i) {
        i = 0;
        value.i =20;
        Value value1 = new Value();
        value = value1;
        System.out.println(value.i + " " + i);

    }
}

class Value {
    int i = 15;
}
