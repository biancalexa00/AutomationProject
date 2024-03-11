package HelperMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsMethod {


    public WebDriver webDriver;

    public AlertsMethod(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void acceptAlert(){
        waitAllert();
        Alert firstAlert= webDriver.switchTo().alert();
        firstAlert.accept();
    }

    public void cancelAllert (){
        waitAllert();
        Alert firstAlert= webDriver.switchTo().alert();
        firstAlert.dismiss();
    }

    public void waitAllert (){
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void fillAllert (String value){
        Alert forthAlert= webDriver.switchTo().alert();
        forthAlert.sendKeys(value);
        forthAlert.accept();

    }

}
