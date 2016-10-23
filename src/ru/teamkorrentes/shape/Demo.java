package ru.teamkorrentes.shape;

/**
 * Демо класс.
 *
 *
 */
public class Demo {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("Площадь круга ");
        System.out.println("Площадь треугольника ");
        System.out.println("Площадь квадрата ");

        /**
         * Массив для определения наибольшей площади фигур.
         */
        Shape[] shapes = {
                new Circle(5),
                new Square(2),
                new Triangle(3, 3, 5, 5, 10, 10)
        };
        if(shapes[0].area() > shapes[1].area() && shapes[0].area() > shapes[2].area()){
            System.out.println("Круг больше всех ");
        }else if (shapes[1].area() > shapes[2].area()) {
            System.out.println("Квадрат больше всех");
        }else{
            System.out.println("Треугольник больше всех");
        }
    }
}
