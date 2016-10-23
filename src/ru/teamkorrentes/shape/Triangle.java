package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади треугольника.
 *
 * @author Манчин А. 13ОИТ18К
 */
public class Triangle extends Shape {

    public Point firstPoint;
    public Point secondPoint;
    public Point thirdPoint;

    public Triangle() {
        this.firstPoint = this.secondPoint = this.thirdPoint = new Point(1, 1);
    }

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint, Color color) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.color = color;
    }

    /**
     * Метод нахождения площади
     * @return Результат нахождения площади
     */
    public double area(){
        return 0.5*Math.abs(
                (firstPoint.getX()-thirdPoint.getX()) * (secondPoint.getY()-thirdPoint.getY()) -
                (secondPoint.getX()-thirdPoint.getX()) * (firstPoint.getY()-thirdPoint.getY())
        );
    }
}
