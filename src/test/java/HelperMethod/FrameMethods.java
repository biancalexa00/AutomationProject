package HelperMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {
    private WebDriver webDriver;

    public FrameMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchSpecificIFrame (String value){
        webDriver.switchTo().frame(value);
    }

    public void switchParentFrame (){
        webDriver.switchTo().parentFrame();
    }
}
