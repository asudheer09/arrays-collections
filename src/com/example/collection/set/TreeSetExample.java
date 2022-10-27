package com.example.collection.set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set= new TreeSet<Integer>();
        set.add(12);
        set.add(2);
        set.add(23);
        set.add(5);
        set.add(1);
       // set.add(12.5);
        System.out.println(set);
List list;
        Set<String> names= new TreeSet<String>();
        names.add("A");
        names.add("P");
        names.add("B");
        names.add("D");
        names.add("C");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("D"));
        System.out.println(names.remove("C"));
        System.out.println(names);

        Iterator itr= names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
