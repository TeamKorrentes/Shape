package ru.teamkorrentes.shape;

/**
 * �������� �����, ��� ����������� ������� ��������.
 *
 * @author ������ �. 13���18�
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
     * ����� ���������� �������
     * @param a ������� ��������
     * @return ��������� ���������� �������
     */
    public double area(){
        return a*a;
    }
}
