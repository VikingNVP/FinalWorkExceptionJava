package Base.MyException;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        super("НЕВЕРНОЕ ЗНАЧЕНИЕ ПОЛА(м/ж)!!!");
    }
}
