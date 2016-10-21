package ru.teamkorrentes.shape;

<<<<<<< HEAD
/**
 * Created by Пользователь on 19.10.2016.
 */
public class Demo {
    public static void main(String [] args){

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("Площадь круга " + Circle.area());
        System.out.println("Площадь треугольника " + Triangle.area());
        System.out.println("Площадь квадрата " + Square.area());
    }
}
=======
public class Demo{
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(5),
                new Triangle(3, 5)
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
>>>>>>> c7ddad1870345dc6fe868eab32521b32f54fd85b
