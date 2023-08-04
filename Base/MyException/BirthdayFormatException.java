package Base.MyException;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Некорректный формат ДАТЫ РОЖДЕНИЯ!!!");
    }
}
