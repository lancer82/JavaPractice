package com.thinlk.demo.map;

import java.util.Comparator;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                result= result==0 ? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 24);

        map.put(s1,"陕西");
        map.put(s2,"甘肃");
        map.put(s3,"云南");

        map.forEach((Student key,String value)-> {
            System.out.println(key+"---"+value);
        });
    }
}
