package com.example.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue= new PriorityQueue();
        Queue queue1= new LinkedList();
        queue1.add("hi");
        queue1.add("h");
        queue1.add("a");
        queue1.add("a");
        queue1.add(null);
        queue1.add(123);
        queue1.add(456);

        System.out.println(queue1);
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.size());
        System.out.println(queue1.contains("a"));
       /* Iterator itr=queue1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

    }
}
