package Tests;

import HelperMethod.ElementMethods;
import HelperMethod.WindowMethods;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
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
        HomePage homePage=new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertsWindowFramePage alertsWindowFramePage=new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToWindowPage();

        WindowPage windowPage=new WindowPage(getWebDriver());
        windowPage.interactWithTabBrowser();
        windowPage.interactNewWindow();

    }


}
