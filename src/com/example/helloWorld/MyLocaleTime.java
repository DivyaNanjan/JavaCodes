package com.example.helloWorld;



import java.text.DateFormat;
import java.util.Date;

public class MyLocaleTime {

    public static void main(String args[]){
        Date date =  new Date();
        System.out.println("Date ***** "+date);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        System.out.println("DateFormat ***** "+dateFormat);
        String formattedDate =  dateFormat.format(date);
        System.out.println("Formatted Date ***** "+formattedDate);
    }
}
