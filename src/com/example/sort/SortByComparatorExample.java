package com.example.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByComparatorExample {
    public static void main(String[] args) {
        Student s1= new Student(123,"suresh",14000);
        Student s2= new Student(456,"satish",12000);
        Student s3= new Student(786,"soumya",16000);
        Student s4= new Student(234,"sagar",18000);
        Student s5= new Student(546,"supriya",18000);

        List<Student> students= new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println("before sorting :: students");
        System.out.println(students);
       // Collections.sort(students,new SortStudentByNameCompartor());
        //Collections.sort(students,new SortStudentById());
        Collections.sort(students,new SortStudentByFee());
        System.out.println("after sorting :: students");
        System.out.println(students);

    }
}
