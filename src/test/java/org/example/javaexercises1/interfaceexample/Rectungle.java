package org.example.javaexercises1.interfaceexample;

public class Rectungle implements Shape, Color{
    String color;
    double sideA;
    double sideB;
    double sideC;
    double h;

    public Rectungle(String color, double sideA, double sideB, double sideC, double h) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.h = h;
    }

    @Override
    public String getColor(){
        return color;
    }
    @Override
    public double getArea(){
        return sideA * h / 2;
    }
    @Override
    public double getPerimetr(){
        return sideA + sideB + sideC;
    }
}
