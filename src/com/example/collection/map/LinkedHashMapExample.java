package com.example.collection.map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String ,Double> map= new LinkedHashMap<>();
        map.put("sudheer",65.0);
        map.put("suresh",53.4);
        map.put("kb",573.4);
        map.put("add",65.0);
        map.put("dfd",554d);
        map.put("sdfdsf",553.4);

        Set<String> keys=map.keySet();

        Collection<Double> values= map.values();

        Iterator itr=values.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }

        System.out.println(map.containsKey("kb"));

        System.out.println(map.containsValue(67));

        System.out.println(keys);

        System.out.println(map);
    }
}
