import java.io.IOException;

import Base.Classes.Presenter;
import Base.Classes.CheckInputData.CCheckBirthday;
import Base.Classes.CheckInputData.CCheckDataProcessor;
import Base.Classes.CheckInputData.CCheckFullName;
import Base.Classes.CheckInputData.CCheckQuantity;
import Base.Classes.CheckInputData.CCheckSex;
import Base.Classes.ParsedData.CDataParseProcessor;
import Base.Classes.UI.CGetData;
import Base.Classes.WorkingWithFile.CFileCreator;
import Base.Classes.WorkingWithFile.CFileWriter;
import Base.Classes.WorkingWithFile.CFindTheSameFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "FinalWorkExceptionJava/Data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}
