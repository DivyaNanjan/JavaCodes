package com.example.inheritance;
/*Aggregation Example*/
public class MySerialCast {

    String name;
    String gender;
    int age;
    Serial serial;

    MySerialCast(String name,String gender,int age,Serial serial){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.serial = serial;
    }

    void display(){
        System.out.println(""+name+" "+gender+" "+age+" "+serial.name+" "+serial.season);
    }

    public static void main(String args[]){
        Serial serial = new Serial("Suits","Episode1","Season2");
        MySerialCast castOne = new MySerialCast("Harvey Specter","Male",40,serial);
        MySerialCast castTwo = new MySerialCast("Mike Ross","Male",30,serial);
        MySerialCast castThree = new MySerialCast("Racheal Zane","Female",27,serial);
        MySerialCast castFour = new MySerialCast("Donna Paulsen","Female",37,serial);
        castOne.display();
        castTwo.display();
        castThree.display();
        castFour.display();



    }
}

class Serial{
    String name,episode,season;

    Serial(String n, String e, String s){
        this.name = n;
        this.episode = e;
        this.season = s;
    }
}
