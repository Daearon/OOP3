package Homework_OOP3;

public class Rectangle extends Polygon {
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
        this.polygonSides.add(sideA);
        this.polygonSides.add(sideB);
        this.polygonSides.add(sideA);
        this.polygonSides.add(sideB);
    }
    @Override
    public double area() {
        return this.polygonSides.get(0)*this.polygonSides.get(1);
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public String toString() {
        return "Прямоугольник, " + super.toString() +
                "Площадь = " + area();
    }
}

