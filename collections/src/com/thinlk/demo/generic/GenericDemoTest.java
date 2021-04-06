package com.thinlk.demo.generic;


import java.util.ArrayList;

public class GenericDemoTest {


    public static void main(String[] args) {
        ArrayList<Number> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        method1(list3);

        method2(list1);
        method2(list2);

        method3(list1);

    }

    private static void method3(ArrayList<? super Number> list3) {
    }

    private static void method2(ArrayList<? extends Number> list2) {
    }

    private static void method1(ArrayList<?> list1) {
    }


}
