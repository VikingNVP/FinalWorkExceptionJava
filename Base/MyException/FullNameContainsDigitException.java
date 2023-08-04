package Base.MyException;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        super("Один из символов Полного имени НЕВАЛИДЕН!!!");
    }
}
