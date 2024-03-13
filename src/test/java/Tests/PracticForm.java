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
        String stateValue="NCR";
        String cityValue2="Delhi";



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
        practiceFormPage.pickState(stateValue);
        practiceFormPage.pickCity(cityValue2);
        practiceFormPage.submit();
//de finalizat vezi filmare 13 martie - trebuie doar sa mai adaugi de aici din formspage sunt facute

        getWebDriver().quit();

    }
}
