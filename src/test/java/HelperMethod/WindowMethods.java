package HelperMethod;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void switchSpecificTabWindow (Integer index){
        List<String> tabsOpened= new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabsOpened.get(index));
    }

    public void closeCurrentWindow (){
        webDriver.close();
    }





}
