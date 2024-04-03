package Pages;

import ObjectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{
    public WebTablesPage(WebDriver webDriver) {
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

    public void addNewEndry(WebTableObject webTableObject){
        elementMethods.fillElement(firstnameField, webTableObject.getFirstnameValue());
        elementMethods.fillElement(lastnameField, webTableObject.getLastnameValue());
        elementMethods.fillElement(emailField, webTableObject.getEmailValue());
        elementMethods.fillElement(ageField, webTableObject.getAgeValue());
        elementMethods.fillElement(salaryField, webTableObject.getSalaryValue());
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentValue());;
        elementMethods.clickElement(submitButton);
    }

    public void editEnrty(WebTableObject webTableObject){
        elementMethods.clickElement(editButton);
        elementMethods.refillElement(firstnameField,webTableObject.getFirstnameValue());
        elementMethods.refillElement(ageField,webTableObject.getAgeValue());
        elementMethods.clickElement(submitButton);
    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteButton);
    }

}
