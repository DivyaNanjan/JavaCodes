package com.example.collections;

import java.util.ArrayList;

public class MyEqualsAndHashcode {

    public static void main(String args[]){
       /* String s1 = new String("apple");
        String s2 = new String("apple");
        ArrayList<String> alist = new ArrayList<String>();
        alist.add(s1);
        alist.add(s2);
        System.out.println("Hashcode of s1  "+s1.hashCode());
        System.out.println("Hashcode of s2  "+s2.hashCode());
        System.out.println("Equals  "+s2.equals(s1));
        System.out.println("List size  "+alist.size());*/

       Student s1 = new Student(1,"Anna");
       Student s2 = new Student(1,"Amy");
        ArrayList<Student> alist = new ArrayList<Student>();
        alist.add(s1);
        alist.add(s2);

       System.out.println("Hashcode of s1  "+s1.hashCode());
       System.out.println("Hashcode of s2  "+s2.hashCode());
       System.out.println("Equals  "+s2.equals(s2));
       System.out.println("List size  "+alist.size());




    }
}

class  Student{

    private int id;
    private String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public boolean equals(Object o){
        if(o == null || !(o instanceof Student))
            return false;

        return this.getId() == ((Student) o).getId();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


}
