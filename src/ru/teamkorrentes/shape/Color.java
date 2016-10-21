package ru.teamkorrentes.shape;

public enum Color {
    RED("Красный"),
    GREEN("Зелёный"),
    BLUE("Синий"),
    YELLOW("Жёлтый"),
    PURPLE("Фиолетовый"),
    LIGHTBLUE("Голубой");

    private final String str;
		
    Color(String s){
        str = s;
    }
		
    public String toString() {
        return str;
    }
}