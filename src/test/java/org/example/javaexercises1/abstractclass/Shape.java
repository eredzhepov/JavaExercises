package org.example.javaexercises1.abstractclass;

abstract public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    abstract double getArea();
    abstract double getPerimetr();
    abstract String getColor();
}
