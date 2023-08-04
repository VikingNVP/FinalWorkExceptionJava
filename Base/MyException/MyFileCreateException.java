package Base.MyException;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Не создан файл в CFileCreator: " + message);
    }
}
