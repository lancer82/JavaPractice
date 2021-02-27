package com.thinlk.java;

import org.junit.Test;

/**
 * @author Thinlk
 * @create 2020-07-08 20:58
 **/
public class GenericsTest {

    @Test
    public void test1() {
        Order<Object> order = new Order<>();//未指定泛型则默认是Object类。
        order.setOrderT(123);
        order.setOrderT("abc");

        Order<String> strOrder = new Order<>("orderString",1001,"strOrder");

        strOrder.setOrderT("hello order");

        System.out.println(strOrder.toString());
    }

    @Test
    public void test2() {
        SubOrder subOrder = new SubOrder();
        subOrder.setOrderT(123);
    }
}
