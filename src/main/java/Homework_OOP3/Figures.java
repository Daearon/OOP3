package Homework_OOP3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Figures {
    private final List<Figure> figures = new ArrayList<>();
    public void printInfo(){
        int k = 1;
        for (Figure figure :
                figures) {
            System.out.printf("%d. ", k);
            System.out.println(figure);
            k++;
        }
    }
    public void add(Figure figure){
        this.figures.add(figure);
    }
    public void remove(int k){
        this.figures.remove(k - 1);
    }
    public void setNewFigure(int k, Figure figure) {
        this.figures.set(k - 1, figure);
    }

    public void sortByArea(){
        Collections.sort(this.figures);
    }
}

