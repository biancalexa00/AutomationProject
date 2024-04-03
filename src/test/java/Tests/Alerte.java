package Tests;

import HelperMethod.AlertsMethod;
import HelperMethod.ElementMethods;
import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alerte extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        AlertsWindowFramePage alertWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        AlertPage alertPage = new AlertPage(getWebDriver());
        PropertyUtility propertyUtility = new PropertyUtility("alertData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        homePage.navigateToAlertFrameWindowPage();
        alertWindowFramePage.navigateToAlertPage();

    }
}
