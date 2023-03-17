package Homework_OOP3;

public class Triangle extends Polygon {

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        if (!((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideC + sideB) > sideA)) {
            throw new InvalidArgumentExpression("Треугольник с указанными сторонами не может существовать");
        }
    }
    @Override
    public double area() {
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.polygonSides.get(0)) *
                (halfPerimeter - this.polygonSides.get(1)) * (halfPerimeter - this.polygonSides.get(2)));
    }
    @Override
    public String toString() {
        return "Треугольник, " + super.toString() +
                "S = " + area();
    }
}

