package ru.teamkorrentes.shape;

/**
 * Демо класс.
 *
 * @author Глазунов А. С. 13ОИТ18К
 */
public class Demo {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("Стандартные конструкторы");
        System.out.println("Площадь круга:" + circle.area());
        System.out.println("Площадь квадрата: "  + square.area());
        System.out.println("Площадь треугольника: " + triangle.area());

        /**
         * Массив для определения наибольшей площади фигур.
         */
        Shape[] shapes = {
                new Circle(new Point(5, 5), 5, Color.RED),
                new Square(new Point(5, 5), 9, Color.BLUE),
                new Triangle(
                        new Point(0, 0),
                        new Point(5, 5),
                        new Point(10, 0),
                        Color.GREEN
                )
        };

        System.out.println("\n\nСравниваемые данные");
        System.out.println("Площадь круга:" + shapes[0].area());
        System.out.println("Площадь квадрата: "  + shapes[1].area());
        System.out.println("Площадь треугольника: " + shapes[2].area());

        if(shapes[0].area() > shapes[1].area() && shapes[0].area() > shapes[2].area()){
            System.out.println("Круг больше всех ");
        }else if (shapes[1].area() > shapes[2].area()) {
            System.out.println("Квадрат больше всех");
        }else{
            System.out.println("Треугольник больше всех");
        }
    }
}
