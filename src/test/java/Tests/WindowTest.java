package Tests;

import HelperMethod.ElementMethods;
import HelperMethod.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WindowTest extends SharedData {

//    public WebDriver webDriver;

    @Test
    public void windowMethod(){

        ElementMethods elementMethods= new ElementMethods(getWebDriver());
        WindowMethods windowMethods= new WindowMethods(getWebDriver());
        elementMethods.scrollElementByPixel(0,450);

        //identificam un element
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        elementMethods.scrollElementByPixel(0,450);

        WebElement alertsField= getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(alertsField);

        elementMethods.scrollElementByPixel(0,450);
        WebElement browserWindowsField= getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        elementMethods.clickElement(browserWindowsField);

        WebElement newTabButton= getWebDriver().findElement(By.id("tabButton"));
        elementMethods.clickElement(newTabButton);

        //trebuie sa identificam numarul de taburi deschise
        windowMethods.switchSpecificTabWindow(1);

        //inchidem tabul curent=close
        //inchidem browserul=quit
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);

        elementMethods.scrollElementByPixel(0,450);
        WebElement newWidowButton= getWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWidowButton);

        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);

        getWebDriver().quit();

    }


}
