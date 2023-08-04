package Base.Classes.CheckInputData;

import Base.AbstractClasses.ACheckFullName;
import Base.MyException.FullNameContainsDigitException;
import Base.MyException.FullNameEmptyValueException;

public class CCheckFullName extends ACheckFullName {

    @Override
    public boolean checkFullName(String[] fullName) {

        for (int i = 0; i < fullName.length; i++) {
            if(fullName[i].length()==0)
                throw new FullNameEmptyValueException();
            for (int j = 0; j < fullName[i].length(); j++) {
                if(Character.isDigit(fullName[i].charAt(j)))
                    throw new FullNameContainsDigitException();
            }
        }
        return true;
    }
}
