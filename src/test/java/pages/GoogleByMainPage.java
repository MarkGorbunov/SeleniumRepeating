package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleByMainPage extends AbstractPage
{
    private final String PAGE_URL = "https://www.google.by/";

    @FindBy(id = "lst-ib")
    private WebElement inputGoogleField;

    public GoogleByMainPage(WebDriver driver)
    {
        super(driver);
    }

    public void openPage()
    {
        driver.get(PAGE_URL);
    }

    public void inputText(String text)
    {
        inputGoogleField.sendKeys(text);
    }

    public void submitGoogleByPage()
    {
        inputGoogleField.submit();
    }
}
