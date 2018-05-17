package com.example.helloWorld;

public class MyStatic {

    static {
        int blockVariable = 100;
        System.out.println("blockVariable ***"+blockVariable);
    }
    static int count = 1;
    int rollno;
    String name;
    static String college = "IIT";


    MyStatic(){
        count++;
        System.out.println("Count ***"+count);
    }
    MyStatic(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
    /* void change(){
        college = "BIT";
    }*/
    void change(){ //The static variable can be changed inside non-static method as well as static method
        college = "NIT";
        /*changeCollegeName();  class method can be accessed from instance method*/
    }
    static void changeCollegeName(){
        /*college = "VIT";*/
        MyStatic m = new MyStatic();
        m.change();//to access the instance method from class method u need to create an object of the class
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public static void main(String args[]){
        college = "MIT"; ///static variable can be changed inside main method

        System.out.println("Count ***"+count);
        //System.out.println("BlockVariable from main ***"+MyStatic.blockVariable); Cannot be accessed from main
        MyStatic objectOne = new MyStatic();
        MyStatic objectTwo = new MyStatic();
        MyStatic objectThree = new MyStatic();



        MyStatic stu1 = new MyStatic(1,"Anna");
        MyStatic stu2 = new MyStatic(2,"Barry");
        MyStatic stu3 = new MyStatic(3,"Carl");
        //stu1.change(); only for this object it changes.
        stu1.change();

        stu1.display();
        stu2.display();
        stu3.display();


    }
}
       /* 1. Instance methods can access instance variables and instance methods directly.
          2. Instance methods can access class variables and class methods directly.
          3. Class methods can access class variables and class methods directly.
          4. Class methods cannot access instance variables or instance methods directly—
             they must use an object reference. Also, class methods cannot use the this keyword as there is no instance
             for this to refer to.*/
