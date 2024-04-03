package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{

    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiceFormField;

    public void navigateToPracticeForm(){
        elementMethods.clickElement(practiceFormField);
    }
}
