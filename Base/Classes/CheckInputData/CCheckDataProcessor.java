package Base.Classes.CheckInputData;

import Base.AbstractClasses.ACheckData;
import Base.AbstractClasses.ACheckDataProcessor;
import Base.AbstractClasses.ACheckFullName;
import Base.AbstractClasses.ACheckQuantity;

public class CCheckDataProcessor extends ACheckDataProcessor {
    public CCheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        super(checkQuantity, checkFullName, checkBirthday, checkSex);
    }

    @Override
    public boolean checkBirthday(String birthday) {
        super.checkBirthday.checkElement(birthday);
        System.out.println("Формат даты рождения: OK");
        return true;
    }

    @Override
    public boolean checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("Формат полного Имени: OK.");
        return true;
    }

    @Override
    public boolean checkQuantity(String[] data) {
        super.checkQuantity.checkQuantity(data);
        System.out.println("Формат номера Телефона: OK.");
        return true;
    }

    @Override
    public boolean checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Формат Пола(f/m): OK.");
        return true;
    }
}
