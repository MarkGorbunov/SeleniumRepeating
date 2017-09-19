package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends AbstractPage
{

    public ResultPage(WebDriver driver)
    {
        super(driver);
    }

    public List<String> getAllLinksTxt()
    {
        List<String> textOfAllLinks = new ArrayList<String>();

        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='ires']//h3/a"));
        for (WebElement element : allLinks)
        {
            textOfAllLinks.add(element.getText().toLowerCase());
        }
        return textOfAllLinks;
    }
}
