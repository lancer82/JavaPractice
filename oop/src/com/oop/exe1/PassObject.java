package com.oop.exe1;

import com.sun.security.jgss.GSSUtil;

/**
 * 值传递练习
 * @author Thinlk
 * @create 2020-12-12 12:16 PM
 *
 **/
/*
* 定义一个类 PassObject 在类中定义一个方法 printAreas() 该方法的定义
如下 public void printAreas(Circle c, int time)
在printAreas 方法中打印输出 1 到 time 之间的每个整数半径值 以及对应的面积 。
例如 times 为 5 则输出半径 1 2 3 4 5 以及对应的圆面积
*
*在 main 方法中调用 printAreas() 方法 调
用完毕后输出当前半径值 。 程序运行结果如图
所示 。
*/
class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");
        for(int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius +"\t\t"+c.findArea());
        }
        c.radius = time + 1;
    }

    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle();
        p.printAreas(c,5);
        System.out.println("now radius is: "+ c.radius);
    }
}
