package com.thinlk.java;

import org.junit.Test;

import java.io.File;

/**
 * File类的使用
 * <p>
 * 1. 一个对象代表一个文件或者一个文件路径
 * 2。声明在java.io包下
 *
 * @author Thinlk
 * @create 2020-07-11 18:35
 **/
public class FileTest {
    /*
    1.创建File类的实例
    2.路径
    相对路径
    绝对路径
    3.路径分隔符
    Windows "\\"
    unix "/"
     */
    @Test
    public void test1() {
        //构造器1
        File file1 = new File("hello.txt");//相对于当前的module
        File file2 = new File("D:\\Project\\JavaPractice\\IO\\hel,txt");

        System.out.println(file1);
        System.out.println(file2);
        //构造器2
        File file3 = new File("D:\\Project\\JavaPractice", "IO");
        System.out.println(file3);

        //构造器3
        File File = new File(file3, "hel.txt");
    }

    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\Project\\JavaPractice\\IO\\hel.txt");
        //D:\Project\JavaPractice\IO
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        System.out.println("-------------------------------");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }


    @Test
    public void test3() {
        File file = new File("D:\\Project\\JavaPractice", "IO");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------");
        File[] files = file.listFiles();
        assert files != null;
        for (File f : files) {
            System.out.println(f);
        }

    }

    @Test
    public void test4(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\Project\\JavaPractice\\IO\\helloWorld.txt");//需要file1存在，file2不存在。

        boolean renameTo = file1.renameTo(file2);
        System.out.println(renameTo);
    }
}
