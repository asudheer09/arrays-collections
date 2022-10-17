package com.example.java8.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.length()); // 7
        System.out.println(string.charAt(0)); // a
        System.out.println(string.indexOf('a', 4)); //4
        System.out.println(string.indexOf("al", 5)); //-1
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 3)); // empty string
        System.out.println(string.substring(3, 2)); // throws exception
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".contains("b")); // true
        System.out.println("\t a b c\n".trim()); // a b c

    }
}
