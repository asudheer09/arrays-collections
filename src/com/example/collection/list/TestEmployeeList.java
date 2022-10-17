package com.example.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeList {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"abc",10000);
        Employee e2= new Employee(2,"def",20000);
        Employee e3= new Employee(3,"ghi",30000);

        List<Employee> employeeList= new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Iterator itr= employeeList.iterator();

        System.out.println("iterate using Iterator");

        while(itr.hasNext()){
          Employee employee= (Employee) itr.next();
            System.out.println(employee);
        }

        System.out.println("iterate using java5 foreach");

        for (Employee e:employeeList) {
            System.out.println(e);
        }
        System.out.println("using for loop to iterate");

        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }


    }
}
