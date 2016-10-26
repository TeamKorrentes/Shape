package ru.teamkorrentes.shape;

/**
 *
 * Абстрактный класс Фигуры.
 * @author Смелов М.А. 13ОИТ18К
 */
public abstract class Shape {

    Color color = Color.RED;


    Color getColor() {
        return color;
    }

    public Shape(Color color) {
        this.color = color;
    }
    /*
    * Заголовок для метода получения площади.
     */
    abstract double area();
}
