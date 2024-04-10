package Pages;

import HelperMethod.AlertsMethod;
import HelperMethod.ElementMethods;
import HelperMethod.FrameMethods;
import HelperMethod.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected ElementMethods elementMethods;
    protected AlertsMethod alertsMethod;
    protected WebDriver webDriver;
    protected FrameMethods frameMethods;
    protected WindowMethods windowMethods;

    public BasePage(WebDriver webDriver){
        this.webDriver=webDriver;
        elementMethods= new ElementMethods(webDriver);
        alertsMethod=new AlertsMethod(webDriver);
        frameMethods= new FrameMethods(webDriver);
        windowMethods= new WindowMethods(webDriver);
        PageFactory.initElements(webDriver,this);
    }
}
