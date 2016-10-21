package ru.teamkorrentes.shape;

public class Demo{
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(5),
                new Triangle(3, 3, 5, 5, 10, 10)
        };

        if(shapes[0].area() > shapes[1].area() && shapes[0].area() > shapes[2].area()){
            System.out.println("Круг больше всех");
        } else if(shapes[1].area() > shapes[2].area()){
            System.out.println("Квадрат больше всех");
        } else {
            System.out.println("Треугольник больше всех");
        }
    }
}