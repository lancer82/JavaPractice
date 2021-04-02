package com.thinlk.demo.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> mylinkedList = new LinkedList<>();

        mylinkedList.add("aaa");
        mylinkedList.add("bbb");
        mylinkedList.add("ccc");

        method1(mylinkedList);

        mylinkedList.addFirst("qqq");
        mylinkedList.addLast("mmm");;
        System.out.println(mylinkedList);
        System.out.println(mylinkedList.getFirst());
        System.out.println(mylinkedList.getLast());
        mylinkedList.removeFirst();
        System.out.println(mylinkedList);
        mylinkedList.removeLastOccurrence("ccc");
        System.out.println(mylinkedList);

    }

    private static void method1(LinkedList<String> mylinkedList) {
        for (int i = 0; i < mylinkedList.size(); i++) {
            String s = mylinkedList.get(i);
            System.out.println(s);
        }

        System.out.println("------------------------------");

        Iterator<String> iterator = mylinkedList.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println("-------------------------------");

        for (String s : mylinkedList) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");
    }
}
