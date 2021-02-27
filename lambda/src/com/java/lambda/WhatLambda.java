package com.java.lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author Thinlk
 * @create 2020-11-30 2:11 PM
 **/
public class WhatLambda {

    @Test
    public void lambdaTest1() {
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        run1.run();

        System.out.println("*************************");

        Runnable run2 = () -> System.out.println("我爱我家");

        run2.run();
    }

    @Test
    public void lambdaTest2 () {
        Comparator<Integer> cap1 = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int compara1 = cap1.compare(21,12);
        System.out.println(compara1);

        System.out.println("********************************");
        Comparator<Integer> cap2 = (o1,o2)-> Integer.compare(o1,o2);
        System.out.println(cap2.compare(23,13));

        System.out.println("********************************");
        Comparator<Integer> cap3 = Integer::compare;
        System.out.println(cap3.compare(33,35));
    }
}
