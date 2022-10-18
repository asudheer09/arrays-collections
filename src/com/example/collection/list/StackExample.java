package com.example.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack :
        //====
        //Stack will extends Vector.
        //Stack follow LIFO(Last in first out order)
        Stack<Integer> data= new Stack<Integer>();
        data.push(123);
        data.push(456);
        data.push(786);
        System.out.println(data.peek());
        System.out.println(data);
        data.pop();
        System.out.println(data);
        System.out.println(data.search(456));
        System.out.println(data.isEmpty());
        System.out.println(data.size());

        Iterator itr= data.iterator();
        System.out.println("iterating the stack using iterator");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("iterating the stack using listIterator");
        ListIterator litr=data.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

    }
}
