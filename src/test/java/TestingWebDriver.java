
import static org.testng.Assert.fail;
import static util.VerifyHelper.linksContainsText;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import pages.GoogleByMainPage;
import pages.ResultPage;

public class TestingWebDriver
{
    private GoogleByMainPage googleByMainPage;
    private ResultPage resultPage;
    private String textForCheck = "beatles";

    @BeforeTest
    public void initialize()
    {
        googleByMainPage = new GoogleByMainPage(DriverSingleton.getDriver());
        resultPage = new ResultPage(DriverSingleton.getDriver());
    }

    @Test
    public void isTextPresentedInAllLinksTest()
    {
        googleByMainPage.openPage();
        googleByMainPage.inputText(textForCheck);
        googleByMainPage.submitGoogleByPage();

        if (!linksContainsText(resultPage.getAllLinksTxt(), textForCheck.toLowerCase()))
        {
            fail("Not all elements contain the search text");
        } else {
            System.out.println("All elements contain the search text");
        }

    }

    @AfterMethod
    public void driverRelease()
    {
        DriverSingleton.closeDriver();
    }
}
