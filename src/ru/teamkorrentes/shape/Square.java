package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади квадрата.
 *
 * @author Манчин А.С. 13ОИТ18К
 */
public class Square extends Shape {

    public Point leftTop;
    public double side;

    /**
     * Конструктор по умолчанию задает точку и сторону.
     */
    public Square() {
        super(Color.RED);
        this.leftTop = new Point(0, 0);
        this.side = 1;
    }

    /**
     * Конструктор с параметрами задает левую точку , сторону и цвет
     * @param leftTop Левая точка
     * @param side Сторона
     * @param color Цвет
     */
    public Square(Point leftTop, double side, Color color) {
        super(color);
        this.leftTop = leftTop;
        this.side = side;
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

    @Override
    public String toString() {
        return "Square{" +
                "leftTop=" + leftTop +
                ", side=" + side +
                "} " + super.toString();
    }
}

