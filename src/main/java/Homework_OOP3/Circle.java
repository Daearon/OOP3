package Homework_OOP3;

public class Circle extends Figure {
    public Double radius;
    public Circle(Double radius) {
        this.radius = radius;
        if (radius <= 0){
            throw new NegativeOrZeroSizeException();
        }
    }
    @Override
    public double area(){return Math.PI*Math.pow(this.radius, 2.0);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return "Радиус круга - " + this.radius  + ", длина окружности = " + perimeter() +
                ", Площадь = " +  area() + ";" ;
    }
}