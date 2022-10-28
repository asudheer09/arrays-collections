package com.example.collection.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Long> map= new Hashtable<>();
        map.put("sudheer",123456789L);
        map.put("sudheer1",121212L);
        map.put("sudheer2",44L);
        map.put("sudheer3",5155L);
        map.put("sudheer4",544545L);
        map.put(null,544545L);
        map.put("sudheer4",9888L);
        System.out.println(map);
        System.out.println(map.get("sudheer"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("sudheer3"));
        System.out.println(map.containsValue(44L));
       Set<Map.Entry<String,Long>> set=map.entrySet();
        Iterator itr=set.iterator();

        while (itr.hasNext()){
            Map.Entry<String,Long> data= (Map.Entry<String,Long>)itr.next();
            System.out.println(data.getKey()+" - "+data.getValue());
        }
    }
}
