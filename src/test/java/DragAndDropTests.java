import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import steps.DragAndDropSteps;
import steps.MainPageSteps;

public class DragAndDropTests
{
    private MainPageSteps mainPageSteps;
    private DragAndDropSteps dragAndDropSteps;

    @BeforeMethod
    public void initialize()
    {
        mainPageSteps = new MainPageSteps();
        dragAndDropSteps = new DragAndDropSteps();
    }

    @Test
    public void changePlaceOfSquares() {
        mainPageSteps.drugAndDropClick();
        System.out.println(dragAndDropSteps.getSquareBLocation());
        System.out.println(dragAndDropSteps.getSquareALocation());
        dragAndDropSteps.dragSquareAToSquareB();
        System.out.println(dragAndDropSteps.getSquareBLocation());
    }

    @AfterSuite
    public void driverRelease()
    {
        DriverSingleton.closeDriver();
    }
}
