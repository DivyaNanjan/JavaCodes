package com.example.helloWorld;

public class HelloWorld {
    int num = 100;

    public void change(HelloWorld hw){
        hw.num=hw.num+10;
    }

    private static void modifyPrimitiveTypes(Integer a, Integer b)
    {
        Integer x = new Integer(a);
        Integer y= new Integer(b);
    }

    public static void main(String args[]) {
        HelloWorld h = new HelloWorld();
        System.out.println("Initial value of num "+h.num);
        h.change(h);
        System.out.println("Initial value of num "+h.num);

        Integer x = new Integer(1);
        Integer y = new Integer(2);
        System.out.print("Values of x & y before primitive modification: ");
        System.out.println(" x = " + x + " ; y = " + y );
        modifyPrimitiveTypes(5,6);
        System.out.print("Values of x & y after primitive modification: ");
        System.out.println(" x = " + x + " ; y = " + y );



   /*     int max = 5;
        int fact = 1;
        int count = 1;
        while (max < 1) {
            fact = fact * max;
            max--;
            System.out.println("in loop" + max);
        }

        System.out.println("Fact Value " + fact);


        int max1 = 5;
        int fact1 = 1;
        do {
            fact1 = fact1 * max1;
            max1--;
            System.out.println("in loop2" + max1);

        } while (max1 < 1);
        System.out.println("Fact1 Value " + fact1);
        String[] array = new String[]{};*/
    }
}
