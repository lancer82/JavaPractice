package com.oop.test;

/**
 * 初始化块的执行顺序是从上到下
 * @author Thinlk
 * @create 2020-12-11 2:37 PM
 **/
public class PersonInit {

    {
        var a = 6;
        if (a > 4)
            System.out.println("PersonInit实例初始化的局部变量，a>4");
        System.out.println("PersonInit第1个定义的实例初始化块");
    }
    {
        System.out.println("PersonInit第2个定义的实例初始化块");
    }
    {
        System.out.println("PersonInti第3个定义的实例初始化块");
    }

    public static void main(String[] args) {
       new PersonInit();
    }
}
