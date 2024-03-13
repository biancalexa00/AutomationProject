package Pages;

import org.openqa.selenium.By;
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
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);
    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWidowButton);
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);
    }

}