package com.example.thread;

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("this is  MyThread");
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        MyTestThread myThread= new MyTestThread();
        //myThread.start();

        for (int i=0;i<10;i++){
            System.out.println("this is my main thread");
        }
    }
}
