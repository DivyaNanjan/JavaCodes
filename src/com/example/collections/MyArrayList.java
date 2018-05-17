package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyArrayList {

    public static void main(String args[]){
        ArrayList<String> techs =new ArrayList<String>();
        /*System.out.println("Please enter the techs");
        Scanner scanner =  new Scanner(System.in);
        for(int i=0;i<3;i++){
            techs.add(scanner.next());
        }

        System.out.println("Entered techs "+techs);*/

        techs.add("Docker");
        techs.add("Springboot");
        techs.add("Java");
        techs.add("Kubernates");
        techs.add("Openshift");
        techs.add("Outsystems");
        ArrayList<String> cloudTechs =new ArrayList<String>();
        cloudTechs.add("Kubernates");
        cloudTechs.add("Openshift");

        techs.add("Android");


        /*techs.removeAll(cloudTechs);
        techs.retainAll(cloudTechs);*/

        Iterator t = techs.iterator();
        while(t.hasNext()){
            System.out.println(" "+t.next());
        }
        System.out.println("**********");
        Iterator t1 = cloudTechs.iterator();
        while(t1.hasNext()){
            System.out.println(" "+t1.next());
        }

        System.out.println("**********");
        techs.remove("Outsystems");
        Iterator T = techs.iterator();
        while(T.hasNext()){
            System.out.println(" "+T.next());
        }

        System.out.println("**********");
        System.out.println("Contains "+techs.contains("Openshift"));
        System.out.println("Indexof "+techs.indexOf("Openshift"));
        System.out.println("LastIndexof "+techs.lastIndexOf("Openshift"));
        System.out.println("ToArray "+techs.toArray());

    }
}
