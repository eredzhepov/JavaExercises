package org.example.javaexercises1.interfaceexample;

public class Main {
    public static void main(String[] args) {
        Rectungle rec = new Rectungle("blue", 23,23,43,22);
        System.out.println("Площадь равна: " + rec.getArea());
        System.out.println("Периметр равен: " + rec.getPerimetr());
        System.out.println("Цвет: " + rec.getColor());
    }
}
