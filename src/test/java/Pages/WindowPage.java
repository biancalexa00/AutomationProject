package Pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "tabButton")
    public WebElement newTabButton;

    @FindBy(id = "windowButton")
    public WebElement newWidowButton;

    public void interactWithTabBrowser(){
        elementMethods.clickElement(newTabButton);
        LoggerUtility.infoTest("The user clicks on new tab button");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtility.infoTest("The user switched the tab with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTest("The user closed the current tab");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtility.infoTest("The user switched the tab with index 0");
    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWidowButton);
        LoggerUtility.infoTest("The user clicks on new window button");
        windowMethods.switchSpecificTabWindow(1);

        LoggerUtility.infoTest("The user switched the window with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTest("The user closed the current window");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtility.infoTest("The user switched the window with index 0");
    }

}
