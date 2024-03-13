package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{
    public WebTablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstnameField;

    @FindBy(id = "lastName")
    public WebElement lastnameField;

    @FindBy(id = "userEmail")
    public WebElement emailField;

    @FindBy(id = "age")
    public WebElement ageField;

    @FindBy(id = "salary")
    public WebElement salaryField;

    @FindBy(id = "department")
    public  WebElement departmentField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "edit-record-4")
    public WebElement editButton;

    @FindBy(id = "delete-record-4")
    public WebElement deleteButton;

    public void addNewEndry(String firstnameValue, String lastnameValue, String emailValue, String ageValue,
                            String salaryValue, String departmentValue){
        elementMethods.fillElement(firstnameField,firstnameValue);
        elementMethods.fillElement(lastnameField,lastnameValue);
        elementMethods.fillElement(emailField,emailValue);
        elementMethods.fillElement(ageField,ageValue);
        elementMethods.fillElement(salaryField,salaryValue);
        elementMethods.fillElement(departmentField,departmentValue);;
        elementMethods.clickElement(submitButton);
    }

    public void editEnrty(String firstnameValueModify, String ageValueModify){
        elementMethods.clickElement(editButton);
        elementMethods.refillElement(firstnameField,firstnameValueModify);
        elementMethods.refillElement(ageField,ageValueModify);
        elementMethods.clickElement(submitButton);
    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteButton);
    }
}
