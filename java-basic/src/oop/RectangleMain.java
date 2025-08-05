package oop;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 8);

        int area = rect.CalculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rect.CalculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rect.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
