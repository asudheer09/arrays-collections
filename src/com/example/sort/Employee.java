package com.example.sort;

public class Employee implements Comparable{
    private Integer id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        Employee emp= (Employee)o;
    // if employee id type is int (primitive type)

        if(this.id>emp.id){ // 150 > 91  --->+ve
            return 1;
        }else if(this.id<emp.id){
            return -1;
        }else{
            return 0;
        }

/*     //descending order
        if(this.id>emp.id){ // 150 > 91  --->+ve
            return -1;
        }else if(this.id<emp.id){
            return 1;
        }else{
            return 0;
        }
*/
      //return this.id.compareTo(emp.id); //if employee id type is Integer

        //return this.name.compareTo(emp.name); if name type is String


    }
}
