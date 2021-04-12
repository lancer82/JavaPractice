package com.thinlk.demo.map;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap1 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");

        Set<String> keySets =  map.keySet();
        for (String k : keySets) {
            String value = map.get(k);
            System.out.println(k+"---"+value);
        }
    }
}
