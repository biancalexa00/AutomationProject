package Tests;

import HelperMethod.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {

    public WebDriver webDriver;

    @Test
    public void metodaTest(){

        ElementMethods elementMethods = new ElementMethods(webDriver);

        //deschidem un browser de chrome
        webDriver=new ChromeDriver();
        //accesam un URL
        webDriver.get("https://demoqa.com/");

        //maximizarea ferestrei
        webDriver.manage().window().maximize();

        //facem scroll in pagina
        elementMethods.scrollElementByPixel(0, 450);

        //identificam un element
        WebElement consentField= webDriver.findElement(By.className("fc-button-label"));
        consentField.click();

        WebElement elementsField= webDriver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();

        elementMethods.scrollElementByPixel(0, 450);

        WebElement webTablesField= webDriver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesField.click();

        WebElement addButton= webDriver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstnameField= webDriver.findElement(By.id("firstName"));
        String firstnameValue= "Bianca";
        elementMethods.fillElement(firstnameField,firstnameValue);

        WebElement lastnameField= webDriver.findElement(By.id("lastName"));
        String lastnameValue= "Alexa";
        elementMethods.fillElement(lastnameField,lastnameValue);

        WebElement emailField= webDriver.findElement(By.id("userEmail"));
        String emailValue= "biancalexa00@gmail.com";
        elementMethods.fillElement(emailField,emailValue);

        WebElement ageField= webDriver.findElement(By.id("age"));
        String ageValue= "25";
        elementMethods.fillElement(ageField,ageValue);

        WebElement salaryField= webDriver.findElement(By.id("salary"));
        String salaryValue= "25";
        elementMethods.fillElement(salaryField,salaryValue);

        WebElement departmentField= webDriver.findElement(By.id("department"));
        String departmentValue= "Testing";
        elementMethods.fillElement(departmentField,departmentValue);

        WebElement submitButton= webDriver.findElement(By.id("submit"));
        elementMethods.clickElement(submitButton);

        // MODIFICAM ENTRY UL ADAUGAT ANTERIOR
        WebElement editButton= webDriver.findElement(By.id("edit-record-4"));
        editButton.click();

        WebElement firstnameFieldModify= webDriver.findElement(By.id("firstName"));
        String firstnameValueModify= "Irina";
        elementMethods.refillElement(firstnameFieldModify,firstnameValueModify);

        WebElement ageFieldModify= webDriver.findElement(By.id("age"));
        String ageValueModify= "26";
        elementMethods.refillElement(ageFieldModify,ageValueModify);

        WebElement submitButtonModify= webDriver.findElement(By.id("submit"));
        elementMethods.clickElement(submitButtonModify);

        //stergem noul entry

        WebElement deleteButton= webDriver.findElement(By.id("delete-record-4"));
        deleteButton.click();


        //inchidem un browser- .quit();
        //inchidem un tab -  .close();
        webDriver.quit();

    }
}
