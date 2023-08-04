package Base.MyException;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("Пустые значения в Полном имени!!!");
    }
}
