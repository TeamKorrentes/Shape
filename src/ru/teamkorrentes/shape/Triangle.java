package ru.teamkorrentes.shape;

<<<<<<< HEAD
/**
 * Created by ������������ on 19.10.2016.
 */
=======
>>>>>>> c7ddad1870345dc6fe868eab32521b32f54fd85b
public class Triangle implements Shape {
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPoint() {
        return 0;
    }

<<<<<<< HEAD

    public static double x1;
    public static double y1;

    public static double x2;
    public static double y2;

    public static double x3;
    public static double y3;
=======
    public static double a;
    public static double h;
>>>>>>> c7ddad1870345dc6fe868eab32521b32f54fd85b

    public Triangle() {
        this.x1 = 1;
        this.y1 = 1;
        this.x2 = 1;
        this.y2 = 1;
        this.x3 = 1;
        this.y3 = 1;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

<<<<<<< HEAD
    public static double area(){
        return 0.5*Math.abs((x1-x3)*(y2-y3) - (x2-x3)*(y1-y3));
=======
    public double area(){
        return a*h*0.5;
>>>>>>> c7ddad1870345dc6fe868eab32521b32f54fd85b
    }
}