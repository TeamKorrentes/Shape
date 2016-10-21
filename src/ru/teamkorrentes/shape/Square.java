package ru.teamkorrentes.shape;

/**
 * Created by ������������ on 19.10.2016.
 */
public class Square implements Shape {
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPoint() {
        return 0;
    }
        
    public static double a;

    public Square() {
        this.a = 1;
    }

    public Square(double a) {
        this.a = a;
    }

    public double area(){
        return a*a;
    }
}
