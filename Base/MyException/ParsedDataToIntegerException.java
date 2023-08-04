package Base.MyException;

public class ParsedDataToIntegerException extends NumberFormatException{
    public ParsedDataToIntegerException(String s) {
        super("Ошибка Конвертации строки в ЧИСЛО!: " + s);
    }
}
