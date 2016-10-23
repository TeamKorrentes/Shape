package ru.teamkorrentes.shape;

import java.util.Scanner;

/**
 * ��������������� ����� ��� ����� ���������.
 *
 * @author �������� �. 13���18�
 */
public class Point {
    static Scanner reader = new Scanner(System.in);
    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
