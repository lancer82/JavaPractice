package com.thinlk.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap3 {

    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        map.put(s1,"陕西");
        map.put(s2,"上海");
        map.put(s3,"广东");

        Set<Student> keys =  map.keySet();
        for (Student key : keys) {
            String value = map.get(key);
            System.out.println(key+"---"+value);
        }

        System.out.println("===================================");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"---"+ value);
        }

        System.out.println("===================================");

        map.forEach((Student key,String value) ->{
            System.out.println(key+"---"+ value);
        });
    }
}
