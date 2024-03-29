package Pages;

import HelperMethod.AlertsMethod;
import HelperMethod.ElementMethods;
import HelperMethod.FrameMethods;
import HelperMethod.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        public ElementMethods elementMethods;
        public AlertsMethod alertsMethod;
        public WebDriver webDriver;
        public FrameMethods frameMethods;
        public WindowMethods windowMethods;

        public BasePage(WebDriver webDriver){
            this.webDriver=webDriver;
            elementMethods= new ElementMethods(webDriver);
            alertsMethod=new AlertsMethod(webDriver);
            windowMethods=new WindowMethods(webDriver);
            frameMethods=new FrameMethods(webDriver);
            PageFactory.initElements(webDriver,this);
        }
}
