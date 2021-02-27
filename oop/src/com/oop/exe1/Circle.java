package com.oop.exe1;

/**
 * 值传递练习
 * @author Thinlk
 * @create 2020-12-12 12:14 PM
 **/
/*
* 1 定义一个 Circle 类 包含一个 double 型的 radius 属性代表圆的半径 一个
* findArea() 方法返回圆的面积
*
*/
class Circle {
    double radius;
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
