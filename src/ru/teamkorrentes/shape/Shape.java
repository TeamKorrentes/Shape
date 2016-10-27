package ru.teamkorrentes.shape;

/**
 *
 * Абстрактный класс Фигуры.
 * @author Смелов М.А. 13ОИТ18К
 */
public abstract class Shape {

    Color color;

    Color getColor() {
        return color;
    }

    /**
     * Конструктор по умолчанию ставит красный цвет
      */
    public Shape(){
        color = Color.RED;
    }

    /**
     * Конструктор с параметрами задает цвет
     * @param color Цвет
     */
    public Shape(Color color) {
        this.color = color;
    }
    /**
     * Заголовок для метода получения площади.
     */
    abstract double area();
}
