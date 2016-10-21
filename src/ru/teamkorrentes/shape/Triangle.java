package ru.teamkorrentes.shape;

public class Triangle implements Shape {
    @Override
    public String getColor() {
        return null;
    }


    public static double x1;
    public static double y1;

    public static double x2;
    public static double y2;

    public static double x3;
    public static double y3;

    public Triangle() {
        x1 = 1;
        y1 = 1;
        x2 = 1;
        y2 = 1;
        x3 = 1;
        y3 = 1;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Triangle.x1 = x1;
        Triangle.y1 = y1;
        Triangle.x2 = x2;
        Triangle.y2 = y2;
        Triangle.x3 = x3;
        Triangle.y3 = y3;
    }

    public double area(){
        return 0.5*Math.abs((x1-x3)*(y2-y3) - (x2-x3)*(y1-y3));
    }
}
