package Homework_OOP3;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure {
    List<Double> polygonSides = new ArrayList<>();
    protected Polygon(double... polygonSides) throws Exception{
        for (double side: polygonSides){
            if (side <= 0){
                throw new Exception("Некорректные данные, отрицательное значение");
            }
        }
    }
    public Double perimeter(){
        double perimeter = 0.0;
        for (double side: this.polygonSides) {
            perimeter += side;

        }
        return perimeter;
    }

    @Override
    public String toString() {
        return "стороны: " + polygonSides + ", " +
                "P = " + perimeter() + ", ";
    }
}
