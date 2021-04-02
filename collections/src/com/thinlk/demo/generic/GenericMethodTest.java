package com.thinlk.demo.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Object[] obj = list.toArray();
        System.out.println(Arrays.toString(obj));
        System.out.println(obj.getClass());
        Object[] Strs = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(Strs));

    }
}
