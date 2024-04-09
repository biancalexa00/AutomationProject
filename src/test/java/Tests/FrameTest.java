package Tests;

import Pages.AlertsWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

    @Test
    public void frameMethod() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertsWindowFramePage alertWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToFramePage();

        FramePage framePage = new FramePage(getWebDriver());
        framePage.dealWithIFrame();
    }
}


