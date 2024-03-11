package Tests;

import HelperMethod.ElementMethods;
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

        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        //facem scroll in pagina
        elementMethods.scrollElementByPixel(0, 450);

        //identificam un element
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        elementMethods.scrollElementByPixel(0, 450);

        WebElement formsField= getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementMethods.clickElement(formsField);

        elementMethods.scrollElementByPixel(0, 450);

        WebElement practiceFormField= getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickElement(practiceFormField);

        WebElement firstnameField= getWebDriver().findElement(By.id("firstName"));
        String firstnameValue= "Bianca";
        elementMethods.fillElement(firstnameField,firstnameValue);

        WebElement lastnameField= getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastnameValue= "Alexa";
        elementMethods.fillElement(lastnameField,lastnameValue);

        WebElement emailField= getWebDriver().findElement(By.id("userEmail"));
        String emailValue= "biancalexa00@gmail.com";
        elementMethods.fillElement(emailField,emailValue);

        WebElement numberField= getWebDriver().findElement(By.id("userNumber"));
        String numberValue= "0746630554";
        elementMethods.fillElement(numberField,numberValue);

        elementMethods.scrollElementByPixel(0, 450);

        WebElement dateOfBirthField= getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMethods.clickElement(dateOfBirthField);

        String monthValue="May";
        WebElement monthDateOfBirth= getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        elementMethods.selectTextElement(monthDateOfBirth,monthValue);

        String yearValue="1998";
        WebElement yearDateOfBirth= getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        elementMethods.selectValueElement(yearDateOfBirth,yearValue);

        List<WebElement> dayOfBirth= getWebDriver().findElements(By.xpath("//div[not(contains(@class,'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]"));
        String dayValue="5";
        for (Integer i=0; i<dayOfBirth.size(); i++) {
            if (dayOfBirth.get(i).getText().equals(dayValue)) {
                dayOfBirth.get(i).click();
                break;
            }
        }

        WebElement genderRadioButton= getWebDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
        genderRadioButton.click();

        elementMethods.scrollElementByPixel(0, 450);

//        WebElement hobbiesRadioButton= webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
//        boolean selectedSatete= hobbiesRadioButton.isSelected();
//        if (selectedSatete== false) {
//            hobbiesRadioButton.click();
//            System.out.println(selectedSatete);
//        }

        //facem un algoritm care sa imi selecteze valorile pe care i le specific
        List<String> Hobbys= Arrays.asList("Sports","Music","Reading");
        List<WebElement> HobbysList= getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[ @class='custom-control-label']"));
        for (Integer index=0; index<HobbysList.size(); index++){
            String currentElementText= HobbysList.get(index).getText();
            if (Hobbys.contains(currentElementText)){
                HobbysList.get(index).click();
            }
        }

//        WebElement hobbiesRadioButton= webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
//        hobbiesRadioButton.click();


        WebElement currentAddres= getWebDriver().findElement(By.id("currentAddress"));
        String currentValue= "Bucovina10";
        elementMethods.fillElement(currentAddres,currentValue);

        WebElement subjectField= getWebDriver().findElement(By.id("subjectsInput"));
        String subjectValue="Economics";
        elementMethods.fillPressElement(subjectField,subjectValue,Keys.ENTER);

        WebElement pictureFiedl= getWebDriver().findElement(By.id("uploadPicture"));
        String filePath="src/test/resources/01.Randare (1).jpg";
        elementMethods.fillElement(pictureFiedl,new File("src/test/resources/01.Randare (1).jpg").getAbsolutePath());

        elementMethods.scrollElementByPixel(0, 450);

        WebElement selectState= getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
        elementMethods.clickElement(selectState);

        WebElement selectSatete2= getWebDriver().findElement(By.id("react-select-3-input"));
        String stateValue="NCR";
        elementMethods.fillPressElement(selectSatete2,stateValue,Keys.ENTER);

        WebElement selectCity= getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
        elementMethods.clickElement(selectCity);

        WebElement selectCity2= getWebDriver().findElement(By.id("react-select-4-input"));
        String cityValue2="Delhi";
        elementMethods.fillPressElement(selectCity2,cityValue2,Keys.ENTER);

        WebElement submit= getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElementForce(submit);

        //validam tabelul cu valori

        List<WebElement> lableFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields=getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(lableFields.get(0).getText(),"Student Name");
        Assert.assertEquals(valueFields.get(0).getText(),firstnameValue+" "+lastnameValue);

        Assert.assertEquals(lableFields.get(1).getText(),"Student Email");
        Assert.assertEquals(valueFields.get(1).getText(),emailValue);

        Assert.assertEquals(lableFields.get(2).getText(),"Gender");
        Assert.assertEquals(valueFields.get(2).getText(),"Female");

        Assert.assertEquals(lableFields.get(3).getText(),"Mobile");
        Assert.assertEquals(valueFields.get(3).getText(),numberValue);

        Assert.assertEquals(lableFields.get(4).getText(),"Date of Birth");
//        Assert.assertEquals(valueFields.get(4).getText(),"12 February,2024");

        Assert.assertEquals(lableFields.get(5).getText(),"Subjects");
        Assert.assertEquals(valueFields.get(5).getText(),subjectValue);

        Assert.assertEquals(lableFields.get(6).getText(),"Hobbies");
        for (Integer index=0; index<Hobbys.size(); index++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbys.get(index)));
        }

        Assert.assertEquals(lableFields.get(7).getText(),"Picture");
        String[] arrayFile=filePath.split("/");
        Integer desiredIndex=arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(),arrayFile[desiredIndex]);

        Assert.assertEquals(lableFields.get(8).getText(),"Address");
        Assert.assertEquals(valueFields.get(8).getText(),currentValue);

        getWebDriver().quit();

    }
}
