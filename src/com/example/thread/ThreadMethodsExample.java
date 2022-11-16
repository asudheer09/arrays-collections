package com.example.thread;

class MyTestThread implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" "+i+" Thread Name: "+Thread.currentThread().getName());
        }
    }
}


public class ThreadMethodsExample {
    public static void main(String[] args) {
        MyTestThread t1= new MyTestThread();
        Thread thread= new Thread(t1);
        thread.setName("ABC");
        thread.start();
       // thread.start();

        MyTestThread t2= new MyTestThread();
        Thread thread2= new Thread(t2);
        thread2.start();
        thread2.setName("XYZ");

    }
}
