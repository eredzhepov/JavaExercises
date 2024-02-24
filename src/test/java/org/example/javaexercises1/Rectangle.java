package org.example.javaexercises1;

public class Rectangle extends Shape {
    private  int height;
    private  int side;


    public String getName(){
        return name;
    }
    public Rectangle( int h, int a){
        if (h <= 0 | a <= 0) {
            System.out.println("Сторона и высота треугольник должны быть больше 0");
        } else {
            this.height = h;
            this.side = a;}

    }

    public void setHeight(int height) {
        if(height <= 0) {
            System.out.println("Высота треугольника должна быть больше 0");
        } else {
            this.height = height;
        }
    }

    public void setSide(int side) {
        if(side <= 0) {
            System.out.println("Сторона треугольника должна быть больше 0");
        } else {
            this.side = height;
        }
    }
@Override
    public double caluclateArea(){
        double s = 0;
        System.out.println("Вычисляем площадь треугольника");
        return s = height * side * 2;
    }
}
