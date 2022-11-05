package com.example.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("Hi");
        s.append(" hello world");
        s.append ("java");

        System.out.println(s);

        String p="hi";
        p.concat("hello world");
        p.concat("java");

        System.out.println(p);

        String s3=s.toString();

        System.out.println(s3);

        StringBuilder sb= new StringBuilder();
        sb.append("hi");
        sb.append(12);
        sb.append('a');
        sb.append(12.345);
        System.out.println(sb);

        String s4= sb.toString();
        System.out.println(s4);


    }
}
