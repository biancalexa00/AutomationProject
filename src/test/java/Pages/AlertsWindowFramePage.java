package Pages;

import HelperMethod.ElementMethods;
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


    public void navigateToAlertPage(){
        elementMethods.scrollElementByPixel(0,350);
        elementMethods.clickElement(alertsField);
    }

    public void navigateToFramePage(){
        elementMethods.clickElement(frameField);
    }


}
