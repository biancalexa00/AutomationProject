package Tests;

import HelperMethod.ElementMethods;
import ObjectData.PracticeFormObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
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
         PropertyUtility propertyUtility= new PropertyUtility("PracticeFormData");
        PracticeFormObject practiceFormObject =new PracticeFormObject(propertyUtility.getAllData());


        HomePage homePage= new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage=new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        PracticeFormPage practiceFormsPage = new PracticeFormPage(getWebDriver());
        practiceFormsPage.fillEntireForm(practiceFormObject);
        practiceFormsPage.validatePracticeFormTable(practiceFormObject);

    }
}
