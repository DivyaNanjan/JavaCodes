package com.example.astract;


abstract class Poly{

    public void polySays(){
        System.out.println("I am called via instantiation");
    }

}

public class MyAbstract extends Poly {
    public void show(){

        System.out.println("From MyAbstract class");

    }
    public static void main(String[] args){

        MyAbstract myAbs = new MyAbstract();
        Poly myPoly = new Poly() {};
        myPoly.polySays();
        myAbs.show();

        System.out.println("Class name : "+myPoly.getClass());
        System.out.println("Class name : "+myAbs.getClass());

    }
}
