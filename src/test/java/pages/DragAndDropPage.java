package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends AbstractPage
{
    public DragAndDropPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "column-a")
    private
    WebElement squareA;

    @FindBy(id = "column-b")
    private
    WebElement squareB;

    public ArrayList<Integer> getSquareALocation() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(squareA.getLocation().getX());
        arrayList.add(squareA.getLocation().getY());
        return arrayList;
    }

    public ArrayList<Integer> getSquareBLocation() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(squareB.getLocation().getX());
        arrayList.add(squareB.getLocation().getY());
        return arrayList;
    }

    public void dragSquareA() {
        Actions action = new Actions(driver);
        action.dragAndDrop(squareA,squareB).build().perform();//TODO don`t work

        action.dragAndDropBy(squareA,200,0);//TODO also don`t word

        action.clickAndHold(squareA); // TODO also don`t work
        action.moveByOffset(215,0);
        action.release().build().perform();
    }
}
