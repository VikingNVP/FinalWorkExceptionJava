package Base.MyException;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException message) {
        super("Исключение при чтении из консоли: " + message.getMessage());
    }
}
