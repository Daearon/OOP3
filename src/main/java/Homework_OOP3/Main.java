package Homework_OOP3;

public class Main {

    public static void main(String[] args) throws Exception{
        Figures figures = new Figures();
        System.out.println("Создание коллекции из 5 фигур ");
        System.out.println("***");
        figures.add(new Circle(9.00));
        figures.add(new Square(5.0));
        figures.add(new Triangle(4.0, 4.0, 4.0));
        figures.add(new Triangle(6.0, 8.0, 7.0));
        figures.add(new Rectangle(11.0, 2.0));

        System.out.println("Созданы следующие фигуры: ");
        System.out.println("***");
        figures.printInfo();
        System.out.println();

        figures.remove(2);
        System.out.println("Удаляем квадрат");
        System.out.println("***");
        figures.printInfo();
        System.out.println();

        figures.setNewFigure(2, new Square(4.0));
        System.out.println("Вставляем новый квадрат: ");
        System.out.println("***");
        figures.printInfo();
        System.out.println();

        System.out.println("Сортировка по площади: ");
        System.out.println("***");
        figures.sortByArea();
        figures.printInfo();
    }
}

