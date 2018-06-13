package com.example.helloWorld;

class Counter{

    int count;

    public synchronized void add(){
        count++;
    }

 }
public class MyThreadSync {
    public static void main(String args[]) throws Exception{
        Counter c= new Counter();

        Thread t1 = new Thread(()-> {
                for(int i =1;i<=1000;i++){
                    c.add();
                }
        });
        Thread t2 = new Thread(()-> {
            for(int i =1;i<=1000;i++){
                c.add();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count  "+c.count);

    }
}
