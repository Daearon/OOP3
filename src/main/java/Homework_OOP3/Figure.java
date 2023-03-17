package Homework_OOP3;


public abstract class Figure implements Comparable<Figure>{
    public abstract double area();
    @Override
    public int compareTo(Figure ex) {
        return Double.compare(this.area(), ex.area());
    }
    public abstract double perimeter();

    public abstract double circumference();
}
