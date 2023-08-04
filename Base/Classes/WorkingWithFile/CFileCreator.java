package Base.Classes.WorkingWithFile;

import java.io.File;
import java.io.IOException;

import Base.AbstractClasses.AFileCreator;
import Base.MyException.FileCreateException;

public class CFileCreator extends AFileCreator {
    /**
     * Создает новый файл по указанному пути.
     * @param path - путь плюс имя файла и расширение.
     * @return - возвращает true в случае удачного создания.
     */
    @Override
    public boolean createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            return super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }
    }
}
