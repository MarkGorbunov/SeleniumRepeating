import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import steps.DropDownListSteps;
import steps.MainPageSteps;

public class DropDownTets
{
    private MainPageSteps mainPageSteps;
    private DropDownListSteps dropDownListSteps;

    @BeforeMethod
    public void initialize()
    {
        mainPageSteps = new MainPageSteps();
        dropDownListSteps = new DropDownListSteps();
    }

    @Test
    public void choseSecondOptionDropDownMenu()
    {
        mainPageSteps.choseDropDown();
        dropDownListSteps.choseSecondOption();
    }

    @Test
    public void choseFirstOptionDropDownMenu()
    {
        mainPageSteps.choseDropDown();
        dropDownListSteps.choseFirstOption();
    }

    @AfterSuite
    public void driverRelease()
    {
        DriverSingleton.closeDriver();
    }
}
