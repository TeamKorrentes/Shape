package ru.teamkorrentes.shape;


/**
 * Вспомогательный класс для ввода цвета.
 *
 * @author Глазунов А. С. 13ОИТ18К
 */
public enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий"),
    YELLOW("Желтый"),
    PURPLE("Фиолетовый"),
    LIGHTBLUE("Голубой");

    private final String str;

    Color(String s){
        str = s;
    }

    public String toString(){
        return str;
    }


}
