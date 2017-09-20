package steps;

import java.util.ArrayList;

import driver.DriverSingleton;
import pages.DragAndDropPage;

public class DragAndDropSteps
{
    private DragAndDropPage dragAndDropPage;

    public DragAndDropSteps()
    {
        dragAndDropPage = new DragAndDropPage(DriverSingleton.getDriver());
    }

    public ArrayList<Integer> getSquareALocation() {
        return dragAndDropPage.getSquareALocation();
    }

    public ArrayList<Integer> getSquareBLocation() {
        return dragAndDropPage.getSquareBLocation();
    }

    public void dragSquareAToSquareB() {
        dragAndDropPage.dragSquareA();
    }
}
