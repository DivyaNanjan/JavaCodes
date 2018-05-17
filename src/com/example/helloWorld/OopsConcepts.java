package com.example.helloWorld;

import sun.security.provider.SHA;

/*
* Java is not a pure object oriented languages since it supports primitive types which are not objects
* In java we need an object to access a class and it satisfies the major OOPs concepts
* 1. Abstraction    : otherwise called the data hiding it is achieved by the below two concepts
* 2. Encapsulation  : Achieved by Access Modifiers to restrict access (public/private/protected)
* 3. Inheritance    : Super class and sub class concepts(IS-A relationship)
* 4. Polymorphism   : Method overloading and method overriding(interfaces)
* 5. Association    : One-To-One, One-To-Many , Many-To-Many(Objects are still independent eg : Teacher vs Student)
* 6. Aggregation    : "HAS-A" relationship but object can exist on own eg: Department vs Teachers
* 7. Composition    : "HAS-A" relationship but object cant exist on own eg: School vs Teachers
* Note :  Java does not allow Multiple Inheritance in order to avoid the ambiguity of overridden methods but
* it can allow a class to implement more than one interface class since the methods are only abstract*/
public class OopsConcepts implements Shape,Colors{
    // Polymorphism by method overloading
    void add(){
       int a = 10+10;
       System.out.println("Sum "+a);
    }
    void add(int x){
        int a = 10+x;
        System.out.println("Sum "+a);
    }
    void add(int x,int y){
        int a = x+y;
        System.out.println("Sum "+a);
    }
    // Polymorphism by method overriding
    @Override
    public void draw() {
        System.out.println("Circle");

    }
    @Override
    public void paint() {
        System.out.println("Yellow");
    }


    public static void main(String args[]){
        OopsConcepts Ob = new OopsConcepts();
        Ob.add();
        Ob.add(20);
        Ob.add(50,50);
        Ob.draw();
        Ob.paint();

        Subclass sb = new Subclass();
        sb.draw();
        sb.paint();
    }


}

// Inheritance
class Subclass extends OopsConcepts implements Shape,Colors{


    @Override
    public void draw() {
        System.out.println("Square");

    }
    @Override
    public void paint() {
        System.out.println("Red");
    }

}


