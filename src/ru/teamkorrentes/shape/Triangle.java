package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади треугольника.
 *
 * @author Манчин А. 13ОИТ18К
 */
public class Triangle implements Shape {
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPoint() {
        return 0;
    }


    public double x1;
    public double y1;

    public double x2;
    public double y2;

    public double x3;
    public double y3;

    public Triangle() {
        this.x1 = 1;
        this.y1 = 1;
        this.x2 = 1;
        this.y2 = 1;
        this.x3 = 1;
        this.y3 = 1;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    /**
     * Метод нахождения площади
     * @param x1,y1 Первый угол
     * @param x2,y2 Второй угол
     * @param x3,y3 Третий угол
     * @return Результат нахождения площади
     */
    public double area(){
        return 0.5*Math.abs((x1-x3)*(y2-y3) - (x2-x3)*(y1-y3));

    }
}
