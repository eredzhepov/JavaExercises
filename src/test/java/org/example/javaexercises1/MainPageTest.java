package org.example.javaexercises1;


import org.example.javaexercises1.Circle;

import java.awt.*;

public class MainPageTest {
    public static void main(String[] args) {

        Shape rectungle = new Rectangle(3,4);
        System.out.println("Площадь треугольника " + rectungle.caluclateArea());

        Shape circle = new Circle(5);

        System.out.println("Площадь круга " + circle.caluclateArea());

    }


}
