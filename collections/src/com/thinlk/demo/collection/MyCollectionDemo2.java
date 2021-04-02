package com.thinlk.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
collection 中remove() 与迭代器中的remove();方法；
 */

public class MyCollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("d");
        list.add("e");

        //传统集合内删除元素的方法

//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if("b".equals(s)){
//
//                list.remove(s);
//                i--;
//            }
//        }

        //调用迭代器中的remove方法。
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String s = iterator.next();
            if ("b".equals(s)) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
