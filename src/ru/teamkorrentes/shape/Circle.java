package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади круга.
 *
 * @author Смелов М.А. 13ОИТ18К
 */
public class Circle implements Shape {

    public double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPoint() {
        return 0;
    }

    /**
     * Метод нахождения площади
     * @param radius Радиус окружности
     * @param PI Число ПИ
     * @return Результат нахождения площади
     */
    public  double area(){
        return Math.PI*radius*radius;
    }
}
