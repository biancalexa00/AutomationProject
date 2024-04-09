package Tests;

import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

    @Test
    public void windowMethod(){
        HomePage homePage=new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertsWindowFramePage alertsWindowFramePage=new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToWindowPage();

        WindowPage windowPage=new WindowPage(getWebDriver());
        windowPage.interactWithTabBrowser();
        windowPage.interactNewWindow();
    }
}
