import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driver.DriverSingleton;

public class TestingWebDriver
{
    @Test
    public void WebDriverTest() {
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("https://www.google.by/");
    }
}
