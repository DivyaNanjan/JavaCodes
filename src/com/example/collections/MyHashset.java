package com.example.collections;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashset {

    public static void main(String args[]){

        HashSet<String> set = new HashSet<String>();
        set.add("Lucifer");
        set.add("Maize");
        set.add("Chloe");
        set.add("Dan");
        set.add("Trixie");
        set.add("Trixie");
        set.add("Chloe");
        set.add("Lucifer");
        set.add(null);

        /*HashSet<String> clonedSet = new HashSet<String>();*/
       Object clonedSet = set.clone();
        System.out.println("Cloned set**** "+clonedSet.getClass());

        System.out.println("Size**** "+set.size());
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(""+it.next());
        }

        HashSet<Book> bookSet = new HashSet<Book>();
        Book one = new Book(101,"Let us C","Yashwant Kanetkar");
        Book two = new Book(102,"Data Communications & Networking","Forouzan");
        Book three = new Book(103,"Operating System","Galvin");
        Book four = new Book(102,"Data Communications & Networking","Forouzan");
        bookSet.add(one);
        bookSet.add(two);
        bookSet.add(three);
        bookSet.add(four);
        bookSet.add(two);
        /*bookSet.add(null);*/

        System.out.println("********************* "+set.size());

        Iterator i = bookSet.iterator();
        while(i.hasNext()){
            System.out.println(""+i.next().toString());
        }


    }
}


class Book{

    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}