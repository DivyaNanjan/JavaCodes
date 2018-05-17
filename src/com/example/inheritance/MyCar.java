package com.example.inheritance;
/*Multilevel & Hierarchical inheritance example*/
public class MyCar {

    void Manufacturer(){
        System.out.println("Honda");
    }
     void category(){
         System.out.println("On road");
     }

    public static void main(String args[]){
        /*MyCar mc = new MyCar();*/
        HondaCity c = new HondaCity();
        c.model();
        c.type();
        c.Manufacturer();
        System.out.println("***********");
        HondaAccord a = new HondaAccord();
        a.model();
        a.type();
        a.Manufacturer();
        System.out.println("***********");
        HondaBrio b =  new HondaBrio();
        b.model();
        b.Manufacturer();

        //Run time polymorphism
        System.out.println("***** Run time polymorphism ******");
        MyCar runPoly = new HondaCity();
        runPoly.category();

    }
}

class Sedan extends MyCar{
    void type(){
        System.out.println("Sedan");
    }
}
class HondaCity extends Sedan{
    void model(){
        System.out.println("HondaCity");
    }
    void category(){
        System.out.println("Second Hand");
    }

   }
class HondaAccord extends Sedan{
    void model(){
        System.out.println("HondaAccord");
    }

}
class HondaBrio extends MyCar{
    void model(){
        System.out.println("HondaBrio");
    }

}