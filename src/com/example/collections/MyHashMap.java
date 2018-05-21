package com.example.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {

    public static void main(String args[]){

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Lucifer");
        map.put(2,"Suits");
        map.put(3,"Prison break");
        map.put(4,"GOT");
        /*map.put(null,"GOT"); does not allow null values
        map.put(null,null);*/

        for(Map.Entry<Integer,String> mapElement:map.entrySet()){
            System.out.println(mapElement.getKey()+" "+mapElement.getValue());
        }

        Map<Integer,Book> bookMap = new HashMap<Integer, Book>();
        Book one = new Book(101,"Let us C","Yashwant Kanetkar");
        Book two = new Book(102,"Data Communications & Networking","Forouzan");
        Book three = new Book(103,"Operating System","Galvin");
        bookMap.put(1,one);
        bookMap.put(2,two);
        bookMap.put(3,three);
//        bookMap.put(4,null);

        for(Map.Entry<Integer,Book> bMap:bookMap.entrySet()){
            System.out.println(bMap.getKey()+" "+bMap.getValue().toString());
        }


    }
}

