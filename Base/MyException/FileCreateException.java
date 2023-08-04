package Base.MyException;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("Файл не был создан: " + message);
    }
}
