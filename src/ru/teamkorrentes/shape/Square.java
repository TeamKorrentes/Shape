package ru.teamkorrentes.shape;

/**
 * Дочерний класс, для определения площади квадрата.
 *
 * @author Манчин А. 13ОИТ18К
 */
public class Square implements Shape {
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPoint() {
        return 0;
    }
        
    public double a;

    public Square() {
        this.a = 1;
    }

    public Square(double a) {
        this.a = a;
    }

    /**
     * Метод нахождения площади
     * @param a Сторона квадрата
     * @return Результат нахождения площади
     */
    public double area(){
        return a*a;
    }
}
