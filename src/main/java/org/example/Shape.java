package org.example;

abstract class Shape {
    public abstract double area();

    public String display(){
        return "The area is " + area();
    }
}
