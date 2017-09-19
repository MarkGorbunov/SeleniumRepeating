package pages;

import java.util.List;
import java.util.stream.Collectors;

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

        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='ires']//h3/a"));

        /*
            for (WebElement element : allLinks) {
            textOfAllLinks.add(element.getText().toLowerCase());
        }
        */

        return allLinks.stream().map(
                s -> {
                    return s.getText().toLowerCase();
                }
        ).collect(Collectors.toList());
    }
}
