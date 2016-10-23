package ru.teamkorrentes.shape;

/**
 * �������� �����, ��� ����������� ������� �����.
 *
 * @author ������ �.�. 13���18�
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
     * ����� ���������� �������
     * @param radius ������ ����������
     * @param PI ����� ��
     * @return ��������� ���������� �������
     */
    public  double area(){
        return Math.PI*radius*radius;
    }
}
