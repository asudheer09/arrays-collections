package com.example.finalkeyword;
import java.lang.*;

 class Parent{

    public final void myMethod(){
        System.out.println("final method");
    }
}

class Child extends Parent{
    /*public  void myMethod(){
        System.out.println("final method");
    }*/
}
public class FinalTest {
    public final int a=10;

    public  void changeFinalValue(){
        //a=20;
    }
    public static void main(String[] args) {
    }
}
