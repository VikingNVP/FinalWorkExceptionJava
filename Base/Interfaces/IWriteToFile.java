package Base.Interfaces;

import Base.MyException.MyFileCreateException;
import Base.MyException.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
