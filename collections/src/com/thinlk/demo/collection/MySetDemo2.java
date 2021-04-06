package com.thinlk.demo.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MySetDemo2 {

    public static void main(String[] args) {
//        TreeSet<Student> setList = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o1.getAge() - o2.getAge();
//                result = result == 0 ? o1.getName().compareTo(o2.getName()):result;
//                return result;
//            }
//        });

        TreeSet<Student> setList = new TreeSet<>((o1,o2)->{
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()):result;
                return result;
        });

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",25);
        Student s5 = new Student("qianqi",27);
        setList.add(s1);
        setList.add(s2);
        setList.add(s3);
        setList.add(s4);
        setList.add(s5);

        System.out.println(setList);
    }
}
