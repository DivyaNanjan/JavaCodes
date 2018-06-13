package com.example.helloWorld;

public class MyThread {

    public static void main(String args[])throws Exception{

        Runnable obj1 = ()-> {
                for(int i=1;i<=5;i++) {
                    System.out.println("Hi");
                    System.out.println("Thread name :"+Thread.currentThread().getName());
                    System.out.println("Thread name :"+Thread.currentThread().getPriority());
                    try{Thread.sleep(1000);} catch (Exception e){}
                }

            };
        Runnable obj2 = ()-> {
                for(int i=1;i<=5;i++) {
                    System.out.println("Hello");
                    System.out.println("Thread name :"+Thread.currentThread().getName());
                    System.out.println("Thread name :"+Thread.currentThread().getPriority());
                    try{Thread.sleep(1000);} catch (Exception e){}
                }

            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("HI THREAD");
        t2.setName("HELLO THREAD");

        System.out.println("t1 Alive ? "+t1.isAlive()+" t2 Alive "+t2.isAlive());

        t1.start();
        System.out.println("t1 Alive ? "+t1.isAlive()+" t2 Alive "+t2.isAlive());
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();

        System.out.println("t1 Alive ? "+t1.isAlive()+" t2 Alive "+t2.isAlive());
        t1.join();
        t2.join();
        System.out.println("t1 Alive ? "+t1.isAlive()+" t2 Alive "+t2.isAlive());
        System.out.println("Bye Bye");

    }
}
