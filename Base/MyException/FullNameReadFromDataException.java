package Base.MyException;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    public FullNameReadFromDataException(String s) {
        super("Исключение Полного имени: " + s);
    }
}
