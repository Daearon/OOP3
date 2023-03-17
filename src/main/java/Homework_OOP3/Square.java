package Homework_OOP3;

public class Square extends Rectangle{

    protected Square(double sideA) throws Exception {
        super(sideA, sideA);
    }
    @Override
    public String toString() {
        return "Квадрат, " + "стороны: " + polygonSides + ", " +
                "Периметр = " + perimeter() + ", " +
                "Площадь = " + area();
    }
}
