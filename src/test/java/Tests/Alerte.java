package Tests;

import HelperMethod.AlertsMethod;
import HelperMethod.ElementMethods;
import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.Hooks;
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

public class Alerte extends Hooks {

    @Test
    public void metodaTest() {

        PropertyUtility propertyUtility = new PropertyUtility("alertData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertsWindowFramePage alertWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage= new AlertPage(getWebDriver());
        alertPage.acceptAlert();
        alertPage.alertTimerComplex();
        alertPage.promptSimple(alertObject.getInputText());
        alertPage.cancelAlert();


    }
}
