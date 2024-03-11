package Tests;

import HelperMethod.AlertsMethod;
import HelperMethod.ElementMethods;
import Pages.AlertPage;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
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
    public void frameMethod() {

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        AlertsMethod alertsMethod = new AlertsMethod(getWebDriver());

        //curs 28 feb si 4 maqrtie pentru fixare
        HomePage homePage= new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertsWindowFramePage alertsWindowFramePage=new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToAlertPage();

        AlertPage alertPage=new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDellayAlert();
        alertPage.dealWithPromtButton("test");
        alertPage.dealWithCancel();

    }
}
