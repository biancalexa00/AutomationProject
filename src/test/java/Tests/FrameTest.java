package Tests;

import HelperMethod.ElementMethods;
import HelperMethod.FrameMethods;
import Pages.FramePage;
import Pages.HomePage;
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

        HomePage homePage= new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        FramePage framePage= new FramePage(getWebDriver());
        framePage.dealWithFrame();
    }
}


