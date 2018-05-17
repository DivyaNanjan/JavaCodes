package com.example.inheritance;
/*Single Inheritance Example*/
public class MyEmployee {

    void calBonus(int sal){
        int netAmt = sal + 10000;
        System.out.println("Net Salary *** "+netAmt);
    }

    public static void main(String args[]){
        /*MyEmployee memp = new MyEmployee();*/
        Contractor c = new Contractor();
        int salary = c.getsal();
        c.calBonus(salary);

    }

}
class Contractor extends MyEmployee{

    int getsal(){
        return 5000;
    }
}
