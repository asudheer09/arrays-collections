package com.example.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set s= new HashSet();
        s.add(123);
        s.add(null);
        s.add("java");
        s.add('a');
        s.add(true);
        s.add(123.456);
       // s.add(123);
       // s.add(null);
       // s.add("java");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.remove(true));
        System.out.println(s);
        System.out.println(s.contains('b'));
        s.clear();

        Iterator itr=s.iterator();
        System.out.println("using while");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("using foreach");
        for (Object o:s) {
            System.out.println(o);
        }

    }
}
