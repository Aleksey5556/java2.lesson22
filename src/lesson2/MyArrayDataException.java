package lesson2;

public class MyArrayDataException extends RuntimeException{
    private int line;

    public MyArrayDataException (int line){
        this.line = line;
    }
}
