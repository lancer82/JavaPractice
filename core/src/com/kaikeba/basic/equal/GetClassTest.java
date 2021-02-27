package com.kaikeba.basic.equal;

import org.junit.Test;

/**
 * 1、class是类的属性，能获取该类编译时的类对象，
 * 2、getClass() 是一个类的方法，获取类运行时的类的对象
 * @author Thinlk
 * @create 2021-01-05 10:14 PM
 **/
public class GetClassTest {
    @Test
    public void testClass() {
        Person man = new Man("Tom", 39, "male");
        System.out.println(man.getClass());
        System.out.println(Person.class);
        Class<? extends String> c = "".getClass();
        System.out.println(c);
    }

}
