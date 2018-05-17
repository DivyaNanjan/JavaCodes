package com.example.helloWorld;

public class MyFinalize {
    public static void main(String[] args)
    {
       /* String s = new String("RR");*/
        MyFinalize s = new MyFinalize();
        s.finalize();// we can also manually call the finalize since its not a keyword but it will not delete the object
        s = null;

        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }

    // Here overriding finalize method
    public void finalize() // method is overriden, the finalize method of each object will be called for garbage collection when the object is no more used.
    {
        System.out.println("finalize method overriden");
        /*System.out.println(10 / 0);*/
    }
}
/*Final and finally are keywords where as finalize is not a keyword*/

   /* 1. If programmer calls finalize method, while executing finalize method some unchecked exception rises, then JVM terminates the program abnormally by rising exception.
         So in this case the program termination is Abnormal.
    2. If Garbage Collector calls finalize method, while executing finalize method some unchecked exception rises then JVM ignores that exception and rest of program will be continued normally.
            So in this case the program termination is Normal and not abnormal.
    3. System.gc() is just a request to JVM to execute the Garbage Collector. It’s up-to JVM to call Garbage Collector or not.
            Usually JVM calls Garbage Collector when there is not enough space available in the Heap area or when the memory is low.*/