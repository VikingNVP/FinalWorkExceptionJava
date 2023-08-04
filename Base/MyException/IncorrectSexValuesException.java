package Base.MyException;

public class IncorrectSexValuesException extends RuntimeException{
    public IncorrectSexValuesException() {
        super("Некорректное значение Пола!!!");
    }
}
