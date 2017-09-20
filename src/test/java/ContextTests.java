import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import steps.ContextMenuPageSteps;
import steps.MainPageSteps;

public class ContextTests
{
    private MainPageSteps mainPageSteps;
    private ContextMenuPageSteps contextMenuPageSteps;

    @BeforeMethod
    public void initialize()
    {
        mainPageSteps = new MainPageSteps();
        contextMenuPageSteps = new ContextMenuPageSteps();
    }

    @Test
    public void verifyContextMenuAlert() throws InterruptedException
    {
        mainPageSteps.contextMenuClick();
        contextMenuPageSteps.click();
    }

    @AfterSuite
    public void driverRelease()
    {
        DriverSingleton.closeDriver();
    }
}
