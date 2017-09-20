package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternetMainPage extends AbstractPage
{
    private final String PAGE_URL = "https://the-internet.herokuapp.com/";

    @FindBy(xpath = "//h1")
    private WebElement headerH1;

    @FindBy(xpath = "//h2")
    private WebElement headerH2;

    @FindBy(xpath = "//a[text() ='Drag and Drop']")
    private WebElement dragAndDropLink;

    @FindBy(xpath = "//a[text() ='Context Menu']")
    private WebElement contextMenuLink;

    @FindBy(xpath = "//a[text() ='Dropdown']")
    private WebElement dropDownLink;

    public InternetMainPage(WebDriver driver)
    {
        super(driver);
    }

    public void openPage()
    {
        driver.get(PAGE_URL);
    }

    public String getH1Text()
    {
        return headerH1.getText();
    }

    public String getH2Text()
    {
        return headerH2.getText();
    }

    public void contextMenuClick()
    {
        contextMenuLink.click();
    }

    public void dropDownListClick()
    {
        dropDownLink.click();
    }

    public void dragAndDropLinkClick()
    {
        dragAndDropLink.click();
    }
}

