package steps;
import driver.DriverSingleton;
import pages.InternetMainPage;

public class MainPageSteps
{
    private final InternetMainPage mainPage;

    public MainPageSteps() {
        mainPage = new InternetMainPage(DriverSingleton.getDriver());
        mainPage.openPage();
    }

    public String getH1Text() {
        return mainPage.getH1Text();
    }

    public String getH2Text() {
        return mainPage.getH2Text();
    }

    public void contextMenuClick(){
        mainPage.contextMenuClick();
    }

    public void choseDropDown() {
        mainPage.dropDownListClick();
    }

    public void drugAndDropClick() {
        mainPage.dragAndDropLinkClick();
    }

}
