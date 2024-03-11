package Pages;

import HelperMethod.AlertsMethod;
import HelperMethod.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        public ElementMethods elementMethods;
        public AlertsMethod alertsMethod;
        public WebDriver webDriver;

        public BasePage(WebDriver webDriver){
            this.webDriver=webDriver;
            elementMethods= new ElementMethods(webDriver);
            alertsMethod=new AlertsMethod(webDriver);
            PageFactory.initElements(webDriver,this);
        }
}
