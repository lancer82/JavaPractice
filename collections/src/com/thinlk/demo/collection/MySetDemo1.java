package com.thinlk.demo.collection;

import java.util.TreeSet;

public class MySetDemo1 {

    public static void main(String[] args) {
        TreeSet<Student> stu1 = new TreeSet<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",25);
        Student s5 = new Student("qianqi",27);
        stu1.add(s1);
        stu1.add(s2);
        stu1.add(s3);
        stu1.add(s4);
        stu1.add(s5);

        System.out.println(stu1);
    }
}
