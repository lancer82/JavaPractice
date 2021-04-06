package com.thinlk.demo.collection;

import java.util.TreeSet;

public class MySetDemo3 {

    public static void main(String[] args) {
        TreeSet<String> strs = new TreeSet<>((o1,o2) -> {
            int res = o1.length()-o2.length();
            res = res==0 ? o1.compareTo(o2) : res;
            return res;
        });

        strs.add("ab");
        strs.add("cd");
        strs.add("qwer");
        strs.add("met");


        System.out.println(strs);
    }
}
