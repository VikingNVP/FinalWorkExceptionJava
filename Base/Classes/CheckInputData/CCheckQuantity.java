package Base.Classes.CheckInputData;

import Base.AbstractClasses.ACheckQuantity;
import Base.MyException.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}
