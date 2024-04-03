package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "alertButton")
    private WebElement alertSimple;
    @FindBy(id = "timerAlertButton")
    private WebElement alertTimerComplex;
    @FindBy(id = "promtButton")
    private WebElement promptSimple;
    @FindBy(id = "confirmButton")
    private WebElement confirmButton;
    @FindBy(id = "promptResult")
    private WebElement promptResult;
    @FindBy(id = "confirmResult")
    private WebElement confirmResult;
    public void acceptAlert() {
        elementMethods.clickElement(alertSimple);
        alertsMethod.acceptAlert();
    }
    public void cancelAlert() {
        elementMethods.clickElement(confirmButton);
        alertsMethod.dismissAlert();
        elementMethods.validateElementText(confirmResult, "You selected Cancel");
    }
    public void alertTimerComplex() {
        elementMethods.clickElemForce(alertTimerComplex);
        alertsMethod.acceptAlert();
    }
    public void promptSimple(String text) {
        elementMethods.clickElement(promptSimple);
        alertsMethod.fillAlert(text);
        elementMethods.validateElementText(promptResult, "You entered " + text);
    }
}


