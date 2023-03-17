package Homework_OOP3;

public class Rectangle extends Polygon {
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }
    @Override
    public double area() {
        return this.polygonSides.get(0)*this.polygonSides.get(1);
    }
    @Override
    public String toString() {
        return "Прямоугольник, " + super.toString() +
                "Площадь = " + area();
    }
}

