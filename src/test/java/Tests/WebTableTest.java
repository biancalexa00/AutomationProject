package Tests;

import HelperMethod.ElementMethods;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
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
        HomePage homePage=new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage=new ElementsPage(getWebDriver());
        elementsPage.navigateToWebTablePage();

        String firstnameValue= "Bianca";
        String lastnameValue= "Alexa";
        String emailValue= "biancalexa00@gmail.com";
        String ageValue= "25";
        String salaryValue= "25";
        String departmentValue= "Testing";
        String firstnameValueModify= "Irina";
        String ageValueModify= "26";

        WebTablesPage webTablesPage=new WebTablesPage(getWebDriver());
        webTablesPage.addNewEntry(firstnameValue,lastnameValue,emailValue,ageValue,salaryValue,departmentValue);
        webTablesPage.editEntry(firstnameValueModify,ageValueModify);
        webTablesPage.deleteEntry();


    }
}
