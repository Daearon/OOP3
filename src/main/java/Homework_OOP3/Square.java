package Homework_OOP3;

public class Square extends Rectangle{

    public Square(double sideA) {
        super(sideA, sideA);
    }
    @Override
    public String toString() {
        return "Квадрат, " + "стороны: " + polygonSides + ", " +
                "Периметр = " + perimeter() + ", " +
                "Площадь = " + area();
    }
}
