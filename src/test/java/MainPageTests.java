import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import steps.MainPageSteps;

public class MainPageTests
{
    private MainPageSteps mainPageSteps;

    @BeforeMethod
    public void initialize()
    {
        mainPageSteps = new MainPageSteps();
    }

    @Test
    public void verifyHeaderText()
    {
        Assert.assertEquals(mainPageSteps.getH1Text(), "Welcome to the-internet");
        Assert.assertEquals(mainPageSteps.getH2Text(), "Available Examples");
    }

//    @Test
//    public void verifyAuthentication()
//    {
//        mainPageSteps.authentification();
//    }

    @AfterSuite
    public void driverRelease()
    {
        DriverSingleton.closeDriver();
    }
}
