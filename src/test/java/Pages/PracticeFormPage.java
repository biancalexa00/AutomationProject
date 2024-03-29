package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "firstName")
    public WebElement firstnameField;

    @FindBy(css = "input[placeholder='Last Name']")
    public WebElement lastnameField;

    @FindBy(id = "userEmail")
    public WebElement emailField;

    @FindBy(id = "userNumber")
    public WebElement numberField;

    @FindBy(css = ".react-datepicker__input-container")
    public WebElement dateOfBirthField;

    @FindBy(css = ".react-datepicker__month-select")
    public WebElement monthDateOfBirth;

    @FindBy(css = ".react-datepicker__year-select")
    public WebElement yearDateOfBirth;

    @FindBy(xpath = "//div[not(contains(@class,'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]")
    public List<WebElement> dayOfBirth;

    @FindBy(css = "label[for='gender-radio-2']")
    public WebElement genderRadioButton;

    @FindBy(id = "currentAddress")
    public WebElement currentAddres;

    @FindBy(id = "subjectsInput")
    public WebElement subjectField;

    @FindBy(id = "uploadPicture")
    public WebElement pictureFiedl;

    @FindBy(xpath = "//div[text()='Select State']")
    public WebElement selectState;

    @FindBy(id = "react-select-3-input")
    public WebElement selectSatete2;

    @FindBy(xpath = "//div[text()='Select City']")
    public WebElement selectCity;

    @FindBy(id = "react-select-4-input")
    public WebElement selectCity2;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[ @class='custom-control-label']")
    public List<WebElement> HobbysList;

    @FindBy(xpath ="//table/tbody/tr/td[2]")
    public  List<WebElement> valueFields;

    @FindBy(xpath = "//table/tbody/tr/td[1]")
    public List<WebElement> lableFields;






    public void fillFirstName(String firstnameValue){
        elementMethods.fillElement(firstnameField,firstnameValue);
        elementMethods.scrollElementByPixel(0,450);
    }

    public void fillLastName(String lastnameValue){
        elementMethods.fillElement(lastnameField,lastnameValue);
    }

    public void fillEmailFild(String emailValue){
        elementMethods.fillElement(emailField,emailValue);
    }

    public void fillNumberFild(String numberValue){
        elementMethods.fillElement(numberField,numberValue);
    }

    public void pickBirtDate(String monthValue, String yearValue, String dayValue){
        elementMethods.clickElement(dateOfBirthField);
        elementMethods.selectTextElement(monthDateOfBirth,monthValue);
        elementMethods.selectValueElement(yearDateOfBirth,yearValue);
        for (Integer i=0; i<dayOfBirth.size(); i++) {
            if (dayOfBirth.get(i).getText().equals(dayValue)) {
                dayOfBirth.get(i).click();
                break;
            }
        }

    }

    public void pickGender(String genderValue){
        genderRadioButton.click();
    }

    public void pickHobbies(List<String> hobbies){
        for (Integer index=0; index<HobbysList.size(); index++){
            String currentElementText= HobbysList.get(index).getText();
            if (hobbies.contains(currentElementText)){
                elementMethods.clickElemForce(HobbysList.get(index));
            }
        }
    }

    public void pickSubjects(String subjectValue){
        elementMethods.fillPressElement(subjectField,subjectValue, Keys.ENTER);
    }

    public void uploadPicture(String filePath){
        elementMethods.fillElement(pictureFiedl,new File("src/test/resources/01.Randare (1).jpg").getAbsolutePath());
    }

    public void pickAddress(String addresValue){
        elementMethods.fillElement(currentAddres,addresValue);
    }

    public void pickState(String stateValue){
        elementMethods.clickElementForce(selectState);
        elementMethods.fillPressElement(selectSatete2,stateValue,Keys.ENTER);
    }

    public void pickCity(String cityValue2){
        elementMethods.clickElement(selectCity);
        elementMethods.fillPressElement(selectCity2,cityValue2,Keys.ENTER);
    }

    public void submit(){
        elementMethods.clickElementForce(submit);
    }

    public void validarePracticeForm(String firstnameValue, String lastnameValue, String emailValue, String numberValue, String subjectValue,
                                     List<String> Hobbys, String currentValue){

        Assert.assertEquals(lableFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), firstnameValue + " " + lastnameValue);

        Assert.assertEquals(lableFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), emailValue);

        Assert.assertEquals(lableFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), "Female");

        Assert.assertEquals(lableFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), numberValue);

        Assert.assertEquals(lableFields.get(4).getText(), "Date of Birth");
        Assert.assertEquals(valueFields.get(4).getText(), "12 February,2024");

        Assert.assertEquals(lableFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), subjectValue);

        Assert.assertEquals(lableFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < Hobbys.size(); index++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbys.get(index)));
        }

        Assert.assertEquals(lableFields.get(7).getText(), "Picture");
        String[] arrayFile = filePath.split("/");
        Integer desiredIndex = arrayFile.length - 1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);

        Assert.assertEquals(lableFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), currentValue);

    }








}
