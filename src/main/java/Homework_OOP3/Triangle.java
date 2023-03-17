package Homework_OOP3;

public class Triangle extends Polygon {

    protected Triangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        this.polygonSides.add(sideA);
        this.polygonSides.add(sideB);
        this.polygonSides.add(sideC);
        if (!((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideC + sideB) > sideA)) {
            throw new Exception("Некорректные данные");
        }
    }
    @Override
    public double area() {
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.polygonSides.get(0)) *
                (halfPerimeter - this.polygonSides.get(1)) * (halfPerimeter - this.polygonSides.get(2)));
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public String toString() {
        return "Треугольник, " + super.toString() +
                "S = " + area();
    }
}

