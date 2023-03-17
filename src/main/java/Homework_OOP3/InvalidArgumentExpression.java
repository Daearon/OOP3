package Homework_OOP3;

public class InvalidArgumentExpression extends RuntimeException{
    public InvalidArgumentExpression(String message){
        super("Некорректные аргументы " + message);
    }
}
