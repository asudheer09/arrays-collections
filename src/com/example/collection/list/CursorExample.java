package com.example.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CursorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add("786");
        list.add("125");
        System.out.println("using iterator");
       Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("using list iterator");
        ListIterator<String> listIterator= list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
