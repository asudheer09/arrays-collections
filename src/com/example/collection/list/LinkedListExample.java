package com.example.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("123");
        list.add(true);
        list.add(123);
        list.add(134.56);
        list.add(null);
        list.add(123);
        System.out.println(list);
        list.remove(new Integer(123));
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(null));

        Employee e1 = new Employee(1, "abc", 10000);
        Employee e2 = new Employee(2, "def", 20000);
        Employee e3 = new Employee(3, "ghi", 30000);

        List<Employee> employeeList = new LinkedList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println("using while +iterator");

        Iterator itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee employee = (Employee) itr.next();
            System.out.println(employee);
        }

        System.out.println("using foreach");

        for (Employee e:employeeList ) {
            System.out.println(e);
        }

    }



}
