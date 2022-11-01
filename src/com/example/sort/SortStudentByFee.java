package com.example.sort;

import java.util.Comparator;

public class SortStudentByFee implements Comparator<Student> {
    @Override
        public int compare(Student s1, Student s2) {
            if(s1.getFees()==s2.getFees()){
                return 0;
            }else if(s1.getFees()>s2.getFees()){
                return -1;
            }else {
                return 1;
            }
        }
}
