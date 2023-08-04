package Base.MyException;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("Файл не найден: " + message);
    }
}
