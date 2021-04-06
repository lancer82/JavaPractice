package com.thinlk.demo.collection;

import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        TreeSet<Pupil> pupils = new TreeSet<>();

        Pupil p1 = new Pupil("zhangsan", 89, 98, 87);
        Pupil p2 = new Pupil("lisi", 89, 96, 93);
        Pupil p3 = new Pupil("wangwu", 85, 94, 91);
        Pupil p4 = new Pupil("zhaoliu", 91, 88, 97);
        Pupil p5 = new Pupil("qianqi", 94, 96, 91);

        pupils.add(p1);
        pupils.add(p2);
        pupils.add(p3);
        pupils.add(p4);
        pupils.add(p5);

        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }
}
