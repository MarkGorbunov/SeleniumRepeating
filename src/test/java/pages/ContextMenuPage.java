package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends AbstractPage
{
    @FindBy(id = "hot-spot")
    private WebElement contextBox;

    public ContextMenuPage(WebDriver driver)
    {
        super(driver);
    }

    public void contextMenuRightClick() throws InterruptedException
    {
        Actions action= new Actions(driver);
        action.moveToElement(contextBox).contextClick().contextClick().contextClick().build().perform();

//        TODO it does not work
//        TimeUnit.SECONDS.sleep(1);
//        Actions action1= new Actions(driver);
//        action1.moveByOffset(5,-30).contextClick().build().perform();
    }
}
