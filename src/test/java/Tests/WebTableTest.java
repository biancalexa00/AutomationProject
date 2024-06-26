package Tests;

import HelperMethod.ElementMethods;
import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {
    @Test
    public void metodaTest(){
        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());
        HomePage homePage = new HomePage(getWebDriver());
        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        WebTablesPage webTablePage = new WebTablesPage(getWebDriver());

        homePage.navigateToElementsPage();
        elementsPage.navigateToWebTablesPage();

//        webTablePage.addNewEntry(webTableObject);
        webTableObject.setFirstnameValue("Bogdan");
        webTableObject.setLastnameValue("Georgel");
        webTableObject.setDepartmentValue("IT Serios");
//        webTablePage.editEntry(webTableObject);
        webTablePage.deleteEntry();

    }
}
