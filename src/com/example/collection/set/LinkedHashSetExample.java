package com.example.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set set= new LinkedHashSet();
        set.add(1);
        set.add("hi");
        set.add(true);
        set.add('c');
        System.out.println(set);
        set.remove('c');
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("hi"));
        System.out.println("using while loop");
        Iterator itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("using foreach loop");
        for (Object o:set) {
            System.out.println(o);
        }

    }
}
