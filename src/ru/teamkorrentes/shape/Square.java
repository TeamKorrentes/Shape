package ru.teamkorrentes.shape;

public class Square implements Shape {
    @Override
    public String getColor() {
        return null;
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
