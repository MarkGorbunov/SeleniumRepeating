package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DropDownListPage extends AbstractPage
{
    public DropDownListPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//option[@value=1]")
    private WebElement firstOption;

    @FindBy(xpath = "//option[@value=2]")
    private WebElement secondOption;

    @FindBy(id = "dropdown")
    private WebElement dropdownList;

    public void dropdownListClick()
    {
        dropdownList.click();
    }

    public void choseFirstOption()
    {
        driverWait.until(ExpectedConditions.elementToBeClickable(firstOption));
        firstOption.click();
    }

    public void choseSecondOption()
    {
        driverWait.until(ExpectedConditions.visibilityOf(secondOption));
        secondOption.click();
    }


}
