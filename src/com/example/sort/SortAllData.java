package com.example.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortAllData {

    public static void main(String[] args) {
       //1. sort integers
        /*TreeSet<Integer> treeSet= new TreeSet<>();
        treeSet.add(12);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(41);
        treeSet.add(3);

        System.out.println(treeSet);

        //2. sort string objects
        TreeSet<String> names= new TreeSet<>();
        names.add("abc"); //abc
        names.add("xyz");//
        names.add("aad");
        names.add("xxy");
        names.add("aaa");
        names.add("xyx");

        System.out.println(names);
*/
        Employee e1= new Employee(150,"def",12000);
        Employee e2= new Employee(91,"dfg",12000);
        Employee e3= new Employee(18,"abc",12000);
        Employee e4= new Employee(11,"dba",12000);
        Employee e5= new Employee(111,"xyz",12000);

     /*   TreeSet<Employee> empset= new TreeSet<>();
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);
        empset.add(e5);

        System.out.println(empset);*/
/*
        List<Integer> integerList= new ArrayList<>();
        integerList.add(15);
        integerList.add(8);
        integerList.add(3);
        integerList.add(7);
        integerList.add(21);
        System.out.println("before sorting ------");
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println("after sorting ------");
        System.out.println(integerList);
        System.out.println("reverse order -------");
        Collections.reverse(integerList);
        System.out.println(integerList);


        List<String> strings= new ArrayList<>();
        strings.add("trump");
        strings.add("modi");
        strings.add("joesph");
        strings.add("sachin");
        strings.add("ponting");
        System.out.println("before sorting....");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println("after sorting....");
        System.out.println(strings);
        System.out.println("after reverse....");
        Collections.reverse(strings);
        System.out.println(strings);*/

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println("before sorting...");
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println("after sorting...");
        System.out.println(employeeList);

    }
}
