package Base.MyException;

public class ParsedDataException extends RuntimeException{
    public ParsedDataException(String message) {
        super("Исключение в цикле при разборе: " + message);
    }
}
