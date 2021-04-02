package com.thinlk.demo.generic;

public class GenericClassTest {

    public static void main(String[] args) {
        GenericClassDemo<String> gcd = new GenericClassDemo<>();

        gcd.setElement("周杰伦");
        System.out.println(gcd.getElement());

        GenericClassDemo<Integer> gcd1 = new GenericClassDemo<>();

        gcd1.setElement(19);
        System.out.println(gcd1.getElement());
    }
}
