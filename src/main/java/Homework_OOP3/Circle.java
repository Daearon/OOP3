package Homework_OOP3;

public class Circle extends Figure {
    protected Double radius;
    public Circle(Double radius) throws Exception{
        this.radius = radius;
        if (radius <= 0){
            throw new Exception("Некорректные данные");
        }
    }
    @Override
    public double area(){return Math.PI*Math.pow(this.radius, 2.0);
    }
    @Override
    public double circumference() {return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return "Радиус круга - " + this.radius  + ", длина окружности = " + circumference() +
                ", Площадь = " +  area() + ";" ;
    }
}