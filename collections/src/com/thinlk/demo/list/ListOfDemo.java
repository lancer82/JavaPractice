package com.thinlk.demo.list;


import java.util.*;

public class ListOfDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
        list.add("e");
        System.out.println(list);

        var map =new HashMap<>(Map.ofEntries(Map.entry("key1","value1"),Map.entry("key2","value2"))) ;
        map.put("key3","value3");
        System.out.println(map);

        var set = new HashSet<>(Set.of("aaa","bbb","ccc"));
        set.add("ddd");
        System.out.println(set);
    }
}
