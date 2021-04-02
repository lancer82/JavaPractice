package com.thinlk.demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
  迭代器的基本使用；
 */
public class MyCollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
