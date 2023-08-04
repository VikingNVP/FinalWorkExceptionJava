package Base.MyException;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Неверное количество введённых элементов!");
    }
}
