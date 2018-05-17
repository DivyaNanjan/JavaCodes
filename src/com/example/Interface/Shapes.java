package com.example.Interface;

public interface Shapes {
    String shape = "Circle";
    void draw();
    abstract String shape();
    static int cube(int x){
        return x*x*x;
    }
}
