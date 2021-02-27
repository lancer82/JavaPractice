package com.oop.recursion;

/**
 * @author Thinlk
 * @create 2020-12-12 11:33 PM
 **/

/*
练习7.1 请用 Java 写出递归求阶乘 ( 的算法
 */
public class Factorial {

    public static void main(String[] args) {

        //方式一: 使用for循环
        double sum = 1;
        for (int i = 0; i < 10; i++) {
            sum = sum * (i + 1);
        }
        System.out.println(sum);
        System.out.println("******************************");
        Factorial factorial = new Factorial();
        System.out.println(factorial.getSum(10));
        System.out.println("******************************");
        System.out.println(factorial.f(10));
    }

    //方式二：递归
    public double getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum(n - 1);
        }
    }

    /*
    练习7.2 已知 有一个数列： f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n), 其中 n 是大于 0
的整数，求 f(10) 的 值。
     */
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}
