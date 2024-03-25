package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.applicationcache.model.ApplicationCacheStatusUpdated;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{
    public WebTablesPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;
    @FindBy(id = "firstName")
    private WebElement firstnameField;
    @FindBy(id = "lastName")
    private WebElement lastnameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "age")
    private WebElement ageField;
    @FindBy(id = "salary")
    private WebElement salaryField;
    @FindBy(id = "department")
    private WebElement departmentField;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id = "edit-record-4")
    private WebElement editButton;

    @FindBy(id = "delete-record-4")
    private WebElement deleteButton;


    public void addNewEntry(String firstnameValue, String lastnameValue, String emailValue, String ageValue,
                            String salaryValue, String departmentValue){
        addButton.click();
        elementMethods.fillElement(firstnameField,firstnameValue);
        elementMethods.fillElement(lastnameField,lastnameValue);
        elementMethods.fillElement(emailField,emailValue);
        elementMethods.fillElement(ageField,ageValue);
        elementMethods.fillElement(salaryField,salaryValue);
        elementMethods.fillElement(departmentField,departmentValue);
        elementMethods.clickElement(submitButton);
    }

    public void editEntry(String firstnameValue, String ageValue){
        editButton.click();
        elementMethods.refillElement(firstnameField,firstnameValue);
        elementMethods.refillElement(ageField,ageValue);
        elementMethods.clickElement(submitButton);
    }

    public void deleteEntry(){
       deleteButton.click();
    }

}
