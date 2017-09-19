import static org.testng.Assert.fail;
import static util.VerifyHelper.linksContainsText;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import pages.GoogleByMainPage;
import pages.ResultPage;

public class TestingWebDriver
{
    private GoogleByMainPage googleByMainPage;
    private ResultPage resultPage;

    @BeforeMethod
    public void initialize()
    {
        googleByMainPage = new GoogleByMainPage(DriverSingleton.getDriver());
        resultPage = new ResultPage(DriverSingleton.getDriver());
    }

    @DataProvider(name = "text for check")
    public Object[][] getText() throws Exception {
        return new Object[][]{
                {"beatles"},
                {"selenium"},
        };
    }

    @Test(dataProvider = "text for check")
    public void isTextPresentedInAllLinksTest(String text)
    {
        googleByMainPage.openPage();
        googleByMainPage.inputText(text);
        googleByMainPage.submitGoogleByPage();

        if (!linksContainsText(resultPage.getAllLinksTxt(), text.toLowerCase()))
        {
            fail("Not all elements contain the search text");
        } else {
            System.out.println("All elements contain the search text");
        }
    }

    @AfterSuite
    public void driverRelease()
    {
        DriverSingleton.closeDriver();
    }
}
