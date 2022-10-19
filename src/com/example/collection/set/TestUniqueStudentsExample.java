package com.example.collection.set;

import com.example.collection.beans.Student;

import java.util.HashSet;
import java.util.Set;

public class TestUniqueStudentsExample extends Object{
    public static void main(String[] args) {
        Student s1= new Student(12,"abc","jntu");
        Student s2= new Student(12,"abc","jntu");

        Set<Student> studentSet= new HashSet<Student>();
        studentSet.add(s1);
        studentSet.add(s2);
        System.out.println(studentSet.size());

       /* Set<String> set= new HashSet<String>();
        set.add("hi");
        set.add("hi");
        System.out.println(set.size());*/

    }
}
