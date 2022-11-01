package com.example.finalkeyword;

public class ImmutableTest {

    public static void main(String[] args) {
        String s="Scahin"; // "Sachin"
        s.concat(" Tendulkar"); // "Sachin Tendulkar"
        System.out.println(s);
        s=s.concat(" Ten dull car");
        System.out.println(s);

    }
}
