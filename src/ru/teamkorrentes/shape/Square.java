package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади квадрата.
 *
 * @author Манчин А. 13ОИТ18К
 */
public class Square extends Shape {

    public Point leftTop;
    public double side;

    public Square() {
        this.leftTop = new Point(0, 0);
        this.side = 1;
    }

    public Square(Point leftTop, double side, Color color) {
        this.leftTop = leftTop;
        this.side = side;
        this.color = color;
    }

    /**
     * Метод нахождения площади
     * @return Результат нахождения площади
     */
    public double area(){
        return side*side;
    }

    public Point getPoint() {
        return leftTop;
    }
}
