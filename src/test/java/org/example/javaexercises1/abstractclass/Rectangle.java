package org.example.javaexercises1.abstractclass;

public class Rectangle extends Shape{
    double sideA;
    double sideB;
    double sideC;
    double h;


    public Rectangle(String color, double sideA, double sideB, double sideC, double h) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.h = h;
    }
    @Override
    public String getColor(){
        return super.color;
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
