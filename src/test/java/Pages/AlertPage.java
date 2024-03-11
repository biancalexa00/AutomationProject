package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (id = "alertButton")
    private WebElement alertOK;

    @FindBy(id = "timerAlertButton")
    private WebElement timeButton;

    @FindBy(id = "promtButton")
    private WebElement prompAlert;

    @FindBy(id = "confirmResult")
    private WebElement alert3TextArea;

    @FindBy(id = "promptResult")
    private WebElement alert4TextArea;

    public void dealWithAcceptAlert() {
        elementMethods.clickElement(alertOK);
        alertsMethod.acceptAlert();
    }

    public void dealWithDellayAlert() {
        elementMethods.clickElement(timeButton);
        alertsMethod.acceptAlert();
    }

    public void dealWithPromtButton(String text){
        prompAlert.click();
        alertsMethod.fillAllert(text);
    }

    public void dealWithCancel(){
        elementMethods.clickElement(alert3TextArea);
        alertsMethod.cancelAllert();
        elementMethods.validateElementText(alert4TextArea, "You selected Cancel");
    }

}


