package ru.teamkorrentes.shape;

public class Circle implements Shape {

    public static double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPoint() {
        return 0;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
