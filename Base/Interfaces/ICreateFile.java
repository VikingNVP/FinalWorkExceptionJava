package Base.Interfaces;

import Base.MyException.FileCreateException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
