package Base.AbstractClasses;

import java.io.FileWriter;

import Base.Classes.WorkingWithFile.CFileCreator;
import Base.Classes.WorkingWithFile.CFindTheSameFileName;
import Base.Interfaces.IWriteToFile;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
