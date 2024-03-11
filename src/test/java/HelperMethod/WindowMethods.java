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
//        System.out.println("Tabul curent are URL-ul " +webDriver.getCurrentUrl());
        webDriver.switchTo().window(tabsOpened.get(1));
        System.out.println("Tabul curent are URL-ul " +webDriver.getCurrentUrl());
    }

    public void closeCurrentWindow (){
        webDriver.close();
    }





}
