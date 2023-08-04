package Base.Classes.CheckInputData;

import Base.AbstractClasses.ACheckData;
import Base.MyException.CheckSexException;
import Base.MyException.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}
