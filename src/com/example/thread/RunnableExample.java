package com.example.thread;

class MyRunnable extends  Abc implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable ");
        }
    }
}


public class RunnableExample {

    public static void main(String[] args) {

        MyRunnable myRunnable= new MyRunnable();

        Thread thread= new Thread(myRunnable);

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("RunnableExample ");
        }

    }



}
