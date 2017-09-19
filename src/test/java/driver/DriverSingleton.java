package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSingleton
{
    private static final String CHROMEDRIVER_EXE_PATH = ".\\src\\chromeDriver\\chromedriver.exe";
    private static final String NORMAL_PARAMETER = "normal";
    private static final int PAGE_LOAD_TIMEOUT = 20;
    private static final int DEFAULT_IMPLICITLY = 10;

    private static WebDriver driver;

    private DriverSingleton()
    {
    }

    public static WebDriver getDriver()
    {
        if (null == driver)
        {
            System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_EXE_PATH);
            DesiredCapabilities chromeCap = DesiredCapabilities.chrome();
            chromeCap.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, NORMAL_PARAMETER);

            driver = new ChromeDriver(chromeCap);
            driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void closeDriver()
    {
        driver.quit();
        driver = null;
    }
}

