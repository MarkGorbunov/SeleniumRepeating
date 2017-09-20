package steps;

import driver.DriverSingleton;
import pages.DropDownListPage;

public class DropDownListSteps
{
    private DropDownListPage dropDownListPage;

    public DropDownListSteps()
    {
        dropDownListPage = new DropDownListPage(DriverSingleton.getDriver());
    }

    public void choseFirstOption()
    {
        dropDownListPage.dropdownListClick();
        dropDownListPage.choseFirstOption();
    }

    public void choseSecondOption()
    {
        dropDownListPage.dropdownListClick();
        dropDownListPage.choseSecondOption();
    }

}
