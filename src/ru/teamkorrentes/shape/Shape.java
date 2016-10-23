package ru.teamkorrentes.shape;

/**
 * Интерфейс Фигура, класс хронит в себе Цвет, Точка, Площадь.
 *
 * @author Смелов М.А. 13ОИТ18К
 */
public abstract class Shape {

    Color color = Color.RED;

    Color getColor() {
        return color;
    }

    abstract double area();
}
