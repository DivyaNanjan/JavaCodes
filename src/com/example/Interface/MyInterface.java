package com.example.Interface;
/* Interface cannot be instantiated like abstract class*/
public class MyInterface {
    public static void main(String args[]){

        Triangle t= new Triangle();
        t.color();
        t.paint();
        t.draw();
        t.shape();

        System.out.println("****************");
        Square t1= new Square();
        t1.color();
        t1.paint();
        t1.draw();
        t1.shape();

        /*Shapes s = new Rectangle();
        s.cube(5);*/ // Its possible in java 8

    }
}

class Triangle implements Colors{

    @Override
    public void draw() {
        System.out.println("trinagle");
    }

    @Override
    public String shape() {
        return "TRIANGLE";
    }

    @Override
    public void paint() {
        System.out.println("Red");
    }

    @Override
    public String color() {
        return "RED";
    }


}


class Square implements Colors{

    @Override
    public void draw() {
        System.out.println("Square");
    }

    @Override
    public String shape() {
        return "SQUARE";
    }

    @Override
    public void paint() {
        System.out.println("Pink");
    }

    @Override
    public String color() {
        return "PINK";
    }
}

class Rectangle implements Shapes {

    @Override
    public void draw() {

    }

    @Override
    public String shape() {
        return null;
    }
}

/*
https://www.javatpoint.com/difference-between-abstract-class-and-interface*/
