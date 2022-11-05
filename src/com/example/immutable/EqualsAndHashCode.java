package com.example.immutable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{

    private int adhar;
    private String name;
    private char gender;

    public Person(int adhar, String name, char gender) {
        this.adhar = adhar;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "adhar=" + adhar +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return adhar == person.adhar && gender == person.gender && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adhar, name, gender);
    }
}


public class EqualsAndHashCode {
    public static void main(String[] args) {
        Set<Person> people= new HashSet<>();
        Person p1= new Person(123,"xyz",'m');
        Person p2= new Person(123,"xyz",'m');
        people.add(p1);
        people.add(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(people.size());

        System.out.println(p1.equals(p2)); //true

        Set<String> strings= new HashSet<>();
        strings.add("hi");
        strings.add("hi");
        System.out.println(strings.size());


    }
}
