package ru.teamkorrentes.shape;

/**
 * Демо класс.
 *
 * @author Глазунов А. С. 13ОИТ18К
 */
public class Demo {
    public static void main(String[] args) {

        Shape[] defaultShapes = {
                new Circle(new Point(5, 5), 5, Color.RED),
                new Square(new Point(5, 5), 9, Color.BLUE),
                new Triangle(
                        new Point(0, 0),
                        new Point(5, 5),
                        new Point(10, 0),
                        Color.GREEN
                )
        };

        getInfo(defaultShapes);

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

        getBiggest(shapes);
    }

    /**
     * Метод для вывода информации о массиве фигур.
     */
    private static void getInfo(Shape[] shapes){
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * Выводит площадь большой фигруы
     * @param shapes
     */
    private static void getBiggest(Shape[] shapes){
        if(shapes[0].area() > shapes[1].area() && shapes[0].area() > shapes[2].area()){
            System.out.println("Круг больше всех ");
        }else if (shapes[1].area() > shapes[2].area()) {
            System.out.println("Квадрат больше всех");
        }else{
            System.out.println("Треугольник больше всех");
        }
    }
}
