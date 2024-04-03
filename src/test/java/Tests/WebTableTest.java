package Tests;

import HelperMethod.ElementMethods;
import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import Pages.WindowPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    public WebDriver webDriver;

    @Test
    public void metodaTest() {
        PropertyUtility propertyUtility=new PropertyUtility("WebTableData");
        WebTableObject webTableObject=new WebTableObject(propertyUtility.getAllData());

        HomePage homePage=new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage=new ElementsPage(getWebDriver());
        elementsPage.navgateToWebTablesPage();

        WebTablesPage webTablePage=new WebTablesPage(getWebDriver());
        webTablePage.addNewEndry(webTableObject);

        webTableObject.setFirstnameValue("Irina");
        webTableObject.setAgeValue("22");

        webTablePage.editEnrty(webTableObject);
        webTablePage.deleteEntry();

    }
}
