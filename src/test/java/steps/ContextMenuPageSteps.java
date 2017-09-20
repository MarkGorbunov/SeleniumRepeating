package steps;

import driver.DriverSingleton;
import pages.ContextMenuPage;

public class ContextMenuPageSteps
{
    private final ContextMenuPage contextMenuPage;

    public ContextMenuPageSteps() {
        contextMenuPage = new ContextMenuPage(DriverSingleton.getDriver());
    }

    public void click() throws InterruptedException
    {
        contextMenuPage.contextMenuRightClick();
    }
}
