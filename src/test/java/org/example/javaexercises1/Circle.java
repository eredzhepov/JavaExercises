package org.example.javaexercises1;

public class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public void setRadius(int radius) {
        if (radius <= 0) {
            System.out.println("Радиус круга должен бытьь больше 0");
        } else {
            this.radius = radius;
        }
    }
    @Override
    public double caluclateArea() {
        double s = 0;
        System.out.println("Вычисляем площадь треугольника");
        return s = (int) (2 * Math.PI * radius);
    }
}
