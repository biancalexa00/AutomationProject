package Tests;

import HelperMethod.ElementMethods;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticForm extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage= new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage=new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        String firstnameValue= "Bianca";
        String lastnameValue= "Alexa";
        String emailValue= "biancalexa00@gmail.com";
        String numberValue= "0746630554";
        String monthValue="May";
        String yearValue="1998";
        String dayValue="5";
        String genderValue= "Female";
        List<String> hobbies = Arrays.asList("Sports", "Music");
        String subjectValue= "comp";
        String filePath= "src/test/resources/01.Randare (1).jpg";
        String addresValue= "Bucovina10";



        PracticeFormPage practiceFormPage= new PracticeFormPage(getWebDriver());

        practiceFormPage.fillFirstName(firstnameValue);
        practiceFormPage.fillLastName(lastnameValue);
        practiceFormPage.fillEmailFild(emailValue);
        practiceFormPage.fillNumberFild(numberValue);
        practiceFormPage.pickBirtDate(monthValue, yearValue, dayValue);
        practiceFormPage.pickGender(genderValue);
        practiceFormPage.pickHobbies(hobbies);
        practiceFormPage.pickSubjects(subjectValue);
        practiceFormPage.uploadPicture(filePath);
        practiceFormPage.pickAddress(addresValue);


//        WebElement selectState= getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
//        elementMethods.clickElement(selectState);
//
//        WebElement selectSatete2= getWebDriver().findElement(By.id("react-select-3-input"));
//        String stateValue="NCR";
//        elementMethods.fillPressElement(selectSatete2,stateValue,Keys.ENTER);
//
//        WebElement selectCity= getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
//        elementMethods.clickElement(selectCity);
//
//        WebElement selectCity2= getWebDriver().findElement(By.id("react-select-4-input"));
//        String cityValue2="Delhi";
//        elementMethods.fillPressElement(selectCity2,cityValue2,Keys.ENTER);
//
//        WebElement submit= getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElementForce(submit);
//
//        //validam tabelul cu valori
//
//        List<WebElement> lableFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
//        List<WebElement> valueFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));
//
//        Assert.assertEquals(lableFields.get(0).getText(),"Student Name");
//        Assert.assertEquals(valueFields.get(0).getText(),firstnameValue+" "+lastnameValue);
//
//        Assert.assertEquals(lableFields.get(1).getText(),"Student Email");
//        Assert.assertEquals(valueFields.get(1).getText(),emailValue);
//
//        Assert.assertEquals(lableFields.get(2).getText(),"Gender");
//        Assert.assertEquals(valueFields.get(2).getText(),"Female");
//
//        Assert.assertEquals(lableFields.get(3).getText(),"Mobile");
//        Assert.assertEquals(valueFields.get(3).getText(),numberValue);
//
//        Assert.assertEquals(lableFields.get(4).getText(),"Date of Birth");
////        Assert.assertEquals(valueFields.get(4).getText(),"12 February,2024");
//
//        Assert.assertEquals(lableFields.get(5).getText(),"Subjects");
//        Assert.assertEquals(valueFields.get(5).getText(),subjectValue);
//
//        Assert.assertEquals(lableFields.get(6).getText(),"Hobbies");
//        for (Integer index=0; index<Hobbys.size(); index++) {
//            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbys.get(index)));
//        }
//
//        Assert.assertEquals(lableFields.get(7).getText(),"Picture");
//        String[] arrayFile=filePath.split("/");
//        Integer desiredIndex=arrayFile.length -1;
//        Assert.assertEquals(valueFields.get(7).getText(),arrayFile[desiredIndex]);
//
//        Assert.assertEquals(lableFields.get(8).getText(),"Address");
//        Assert.assertEquals(valueFields.get(8).getText(),currentValue);

        getWebDriver().quit();

    }
}
