package com.example.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add(123);
        v.add(123.456);
        v.add(true);
        v.add("hello");
        v.add('c');
        v.add(123.456);
        v.add(true);
        v.add(null);

        System.out.println(v);
        v.remove(123.456);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.contains("hello"));
       // v.clear();
       // System.out.println(v);
        System.out.println(v.get(3));
        System.out.println("iterate using iterator");
        Iterator itr= v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("using foreach");
        for (Object obj:v ) {
            System.out.println(obj);
        }

        System.out.println("using Enumeration");
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println("using ListIterator");
        ListIterator litr= v.listIterator();

        while(litr.hasNext()){
            System.out.println(litr.next());
        }



    }
}
