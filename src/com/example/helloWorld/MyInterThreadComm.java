package com.example.helloWorld;

class Value{
    int num;
    boolean setVal = false;

    public synchronized void put(int n){
        while (setVal){
            try{
                System.out.println("Put While"); wait();}catch (Exception e){}
        }
        this.num = n;
        System.out.println("Put : "+n);
        setVal = true;
        notify();
    }

    public synchronized void get(){
        while (!setVal){
            try{ System.out.println("Get While");wait();}catch (Exception e){}
        }
        System.out.println("Get : "+num);
        setVal = false;
        notify();
    }
}

class Producer implements Runnable{

    Value v;

    public Producer(Value v) {
        this.v = v;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    public void run(){
        int i=1;
        while (true){
            System.out.println("value of i "+i);
            v.put(i++);
            try{ Thread.sleep(1000);}catch (Exception e){}

        }
    }
}

class Consumer implements Runnable{

    Value v;

    public Consumer(Value v) {
        this.v = v;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }

    public void run(){
        while (true){
            v.get();
            try{ Thread.sleep(1000);}catch (Exception e){}
        }

    }
}

public class MyInterThreadComm {
    public static void main(String args[]){

        Value v = new Value();
        new Producer(v);
        new Consumer(v);

    }
}
