package com.example.helloWorld;


class MotherClass{
    final int val;
    static final int max;
    static{
        max =100;
    }
    MotherClass(){ // final variables can be initialized only inside constructors
        val = 500;
    }
    final void run(){
        System.out.println("In parent class");
    }
}
class MyFinal extends MotherClass {

//    void run(){ this method cannot be overridden
//        System.out.println("In child class");
//    }

    public static void main(String args[]){

        System.out.println("Max value "+max);
        MyFinal f= new MyFinal();
        System.out.println("Val value "+f.val);
       // f.max = 50; the variable cannot be changed as well
        f.run();
    }
}

        /*Note : If a class is declared as final then
        by default all of the methods present in that class are automatically final but variables are not.*/

