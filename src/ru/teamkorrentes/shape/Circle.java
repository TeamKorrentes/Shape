package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади круга.
 *
 * @author Смелов М.А. 13ОИТ18К
 */
public class Circle extends Shape {

    private Point center;
    private double radius;

    /**
     * Конструктор по умолчанию задает центр и радиус
     */
    public Circle() {
        super(Color.RED);
        this.center = new Point(0, 0);
        this.radius = 1;
    }
    /**
     * Конструктор с параметрами задает центр, радиус и цвет
     * @param center Центр окружности
     * @param radius Радиус
     * @param color Цвет
     */
    public Circle(Point center, double radius, Color color) {
        super(color);
        this.center = center;
        this.radius = radius;
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

    @Override
    public String toString() {
        return "Круг с центром(" + center.toString() + "), цветом \"" + color.toString() + "\" и радиусом " + radius;
    }
}


