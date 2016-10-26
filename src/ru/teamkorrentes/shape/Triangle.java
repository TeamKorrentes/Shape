package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади треугольника.
 *
 * @author Манчин А.С. 13ОИТ18К
 */
public class Triangle extends Shape {

    public Point firstPoint;
    public Point secondPoint;
    public Point thirdPoint;

    /**
     * Конструктор по умолчанию задает первую, второю и третью точку.
     */
    public Triangle() {
        super(Color.RED);
        this.firstPoint = new Point(0, 0);
        this.secondPoint = new Point(0, 0);
        this.thirdPoint = new Point(0, 0);
    }

    /**
     * Конструктор с параматрами задает первую точку,вторую точку, третью точку и цвет
     * @param firstPoint Первая точка
     * @param secondPoint Вторая точка
     * @param thirdPoint Третья точка
     * @param color Цвет
     */
    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint, Color color) {
        super(color);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
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

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                "} " + super.toString();
    }
}
