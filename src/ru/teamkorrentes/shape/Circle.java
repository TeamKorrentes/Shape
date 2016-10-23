package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади круга.
 *
 * @author Смелов М.А. 13ОИТ18К
 */
public class Circle extends Shape {

    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point(0, 0);
        this.radius = 1;
    }

    public Circle(Point center, double radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Point getPoint() {
        return center;
    }

    /**
     * Метод нахождения площади
     * @return Результат нахождения площади
     */
    public  double area(){
        return Math.PI*radius*radius;
    }
}
