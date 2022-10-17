package com.example.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(123);
        list.add(143.123);
        list.add(true);
        list.add('c');
        list.add("hello");
        list.add(123);
        list.add(143.123);
        list.add('c');
        list.add("hello");
        //Employee e = new Employee(1,"ahshd",12232);
        //list.add(e);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        list.remove(0);
        list.remove("hello");
        System.out.println(list); //[]
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("hello"));
        System.out.println(list.get(0));
        list.clear();
        System.out.println(list);

        List<String> namesList= new ArrayList<String>();
        //List<Employee> namesList= new ArrayList<Employee>();
        namesList.add("hi");
       // namesList.add(true);
        namesList.add("hello");
        namesList.add("world");

        for (String s: namesList ) {
            System.out.println(s);
        }

    }
}
