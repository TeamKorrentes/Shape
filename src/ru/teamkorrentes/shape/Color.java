package ru.teamkorrentes.shape;


/**
 * ��������������� ����� ��� ����� �����.
 *
 * @author �������� �. �. 13���18�
 */
public enum Color {
    RED("�������"),
    GREEN("�������"),
    BLUE("�����"),
    YELLOW("������"),
    PURPLE("����������"),
    LIGHTBLUE("�������");

    private final String str;

    Color(String s){
        str = s;
    }

    public String toString(){
        return str;
    }


}
