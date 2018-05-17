package com.example.helloWorld;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFinally {

    void multiply(){

        try{
            System.out.println("Inside try block");
            int z = 10*2;
        }catch(ArithmeticException e){
            System.out.println("Inside catch block");

        }finally {
            System.out.println("Inside finally block");
        }
    }
    void division(){
        try{
            System.out.println("Inside try block");
            int z = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Inside catch block");

        }finally {
            System.out.println("Inside finally block");
        }
    }
    void divisionTryWithOutCatch(){
        try{
            System.out.println("Inside try block");
            int z = 10/0;
        }catch(NullPointerException e){
            System.out.println("Inside catch block");

        }finally {
            System.out.println("Inside finally block");
        }
    }
    void ReadFile(){
        PrintWriter out = null;
        try {
            System.out.println("Entered try statement");

            // PrintWriter, FileWriter
            // are classes in io package
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        }
        catch (IOException e) {
            // Since the FileWriter in
            // try block can throw IOException
        }

        // Following finally block cleans up
        // and then closes the PrintWriter.

        finally
        {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close(); // to aviod resource leak we can use finally method.
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    public static void main(String args[]){
        MyFinally m = new MyFinally();

        m.ReadFile();

    }
}

/*Final and finally are keywords where as finalize is not a keyword*/
