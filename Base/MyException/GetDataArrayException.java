package Base.MyException;

public class GetDataArrayException extends RuntimeException{
    public GetDataArrayException() {
        super("Массив данных нулевой. Перед получением данных нужно запустить метод parseData!!!");
    }
}
