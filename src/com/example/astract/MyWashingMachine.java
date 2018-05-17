package com.example.astract;
/*Abstract class example
* abstract class can have instance variables , abstract methods and instance methods as well
* abstract class can have constructors but cannot be instantiated*/
public class MyWashingMachine {

    public static void main(String args[]){
        Lg lg = new Lg();
        int lc = lg.getBasicCost();
        System.out.println("**** LG ****");
        lg.getPrice(lc);

        Haier h = new Haier();
        int hc = h.getBasicCost();
        System.out.println("**** Haier ****");
        h.getPrice(hc);

        Samsung s = new Samsung();
        int sc = s.getBasicCost();
        System.out.println("**** Samsung ****");
        s.getPrice(sc);



    }

}

class Lg extends WashingMachine{

    int price;
    @Override
    int getBasicCost() {
        return super.getBasicCost();
    }

    @Override
    void getPrice(int c) {
        price = c * 1000;
        System.out.println("LG Price "+price);

    }
}
class Haier extends WashingMachine{

    int price;
    @Override
    int getBasicCost() {
        return super.getBasicCost();
    }

    @Override
    void getPrice(int c) {
        price = c * 1500;
        System.out.println("Haier Price "+price);

    }
}
class Samsung extends WashingMachine{

    int price;
    @Override
    int getBasicCost() {
        return super.getBasicCost();
    }

    @Override
    void getPrice(int c) {
        price = c * 2000;
        System.out.println("Samsung Price "+price);

    }
}

abstract class WashingMachine{
     int basicCost;
     WashingMachine(){
         basicCost = 500;
     }
     int getBasicCost(){
         return basicCost;
     }
     abstract void getPrice(int c);


}
