package com.example.immutable;

final class Student{
    private final  String name;
    private final int id;
    private final double fees;

    public Student(String name, int id, double fees) {
        this.name = name;
        this.id = id;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getFees() {
        return fees;
    }
}

class Employee{
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ImmutableExample {
    public static void main(String[] args) {
        Student student= new Student("sudheer",123,12345);

        Employee employee= new Employee(123,"sudheer");
        System.out.println(employee);
      //  employee.setId(124);
       // employee.setName("suresh");

        System.out.println(employee);
    }
}
