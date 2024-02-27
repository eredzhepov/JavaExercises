package org.example.javaexercises1.abstractclass;

public class Main {
    public static void main(String[] args) {
        Shape rec = new Rectangle("blue",15,24,5,12);
        System.out.println("Площадь равна: " + rec.getArea());
        System.out.println("Периметр равен: " + rec.getPerimetr());
        System.out.println("Цвет: " + rec.getColor());
    }
}
