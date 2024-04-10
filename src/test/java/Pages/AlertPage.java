package Pages;

import loggerUtility.LoggerUtility;
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
        LoggerUtility.infoTest("The user clicks on element");

        alertsMethod.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");
    }
    public void cancelAlert() {
        elementMethods.clickElement(confirmButton);
        LoggerUtility.infoTest("The user clicks on element");

        alertsMethod.dismissAlert();
        LoggerUtility.infoTest("The user clicks on element");

        elementMethods.validateElementText(confirmResult, "You selected Cancel");
        LoggerUtility.infoTest("The user sets the text for the alert");
    }
    public void alertTimerComplex() {
        elementMethods.clickElemForce(alertTimerComplex);
        LoggerUtility.infoTest("The user clicks on element");
        alertsMethod.acceptAlert();
        LoggerUtility.infoTest("The user accepts alert");
    }
    public void promptSimple(String text) {
        elementMethods.clickElement(promptSimple);
        LoggerUtility.infoTest("The user clicks on element");
        alertsMethod.fillAlert(text);
        LoggerUtility.infoTest("The user clicks on element");
        elementMethods.validateElementText(promptResult, "You entered " + text);
        LoggerUtility.infoTest("The user validates the element text");
    }
}


