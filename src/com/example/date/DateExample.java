package com.example.date;

//import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date d= new Date();

        System.out.println(d);
        // dd-MM-yyyy

        SimpleDateFormat sdf =new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss z");

        String mydate=sdf.format(d);

        System.out.println(mydate);

        try {
            Date d1=sdf.parse(mydate);
            System.out.println(d1);
        } catch (ParseException e) {
            e.printStackTrace();
        }




    }
}
