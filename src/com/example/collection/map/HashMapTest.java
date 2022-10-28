package com.example.collection.map;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(null,"123");
        map.put(null,"456");
        map.put("abc",null);
        map.put("abd",null);
        map.put("abe",null);
        map.put(true,null);
        map.put(123,null); // Integer
        map.put(123.456,null); //Double

        Set s1=map.entrySet();

        Iterator itr= s1.iterator();

        while (itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }


        Map table = new Hashtable();
     //   table.put(null,null); //gives NullPointerException
        System.out.println(table);

        System.out.println(map);
    }
}
