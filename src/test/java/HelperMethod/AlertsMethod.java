package HelperMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsMethod {
    private WebDriver webDriver;

    public AlertsMethod(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void acceptAlert() {
        waitForAlert();
        Alert secondAlert = webDriver.switchTo().alert();
        secondAlert.accept();
    }

    public void dismissAlert() {
        Alert secondAlert = webDriver.switchTo().alert();
        secondAlert.dismiss();
    }

    public void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void fillAlert(String text) {
        Alert promptAlert = webDriver.switchTo().alert();
        promptAlert.sendKeys(text);
        promptAlert.accept();
    }
}
