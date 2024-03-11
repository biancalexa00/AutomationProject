package Tests;

import HelperMethod.ElementMethods;
import HelperMethod.FrameMethods;
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

public class FrameTest extends SharedData {

//    public WebDriver webDriver;

    @Test
    public void frameMethod() {
        ElementMethods elementMethods= new ElementMethods(getWebDriver());
        FrameMethods frameMethods= new FrameMethods(getWebDriver());

        //facem scroll in pagina
        elementMethods.scrollElementByPixel(0,450);

        //identificam un element
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        elementMethods.scrollElementByPixel(0,450);
        WebElement alertsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(alertsField);

        elementMethods.scrollElementByPixel(0,450);;
        WebElement browserWindowsField = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(browserWindowsField);

        //interactionam cu un iFrame
        frameMethods.switchSpecificIFrame("frame1");
        WebElement frameElement= getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frameElement);

        //specificam sa revina la frame-ul principal
        frameMethods.switchParentFrame();

        frameMethods.switchSpecificIFrame("frame2");
        WebElement frame2Element= getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame2Element);

    }

    // sa facem drivarul privat in toate testele TEMA!

}


