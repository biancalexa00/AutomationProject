package Pages;

import HelperMethod.ElementMethods;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsWindowFramePage extends BasePage{

    public AlertsWindowFramePage(WebDriver webDriver){
        super(webDriver);
    }
    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsField;
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement browserWindowsField;
    public void navigateToAlertPage(){
        elementMethods.scrollElementByPixel(0,350);
        LoggerUtility.infoTest("The user scrolls down the page");
        elementMethods.clickElement(alertsField);
        LoggerUtility.infoTest("The user clicks on element");
    }
    public void navigateToFramePage(){
        elementMethods.clickElement(frameField);
        LoggerUtility.infoTest("The user clicks on element");
    }
    public void navigateToWindowPage(){
        elementMethods.clickElement(browserWindowsField);
        LoggerUtility.infoTest("The user clicks on element");
    }
}
