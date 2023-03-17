package Homework_OOP3;

public class NegativeOrZeroSizeException extends InvalidArgumentExpression{
    public NegativeOrZeroSizeException(){
        super("Размер не может быть равным 0 или меньше 0");
    }
}
