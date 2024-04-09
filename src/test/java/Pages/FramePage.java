package Pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {

    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement textFrame;

    public void dealWithIFrame() {

        frameMethods.switchSpecificIFrame("frame1");
        LoggerUtility.infoTest("The user switch to a specific IFrame");

        frameMethods.switchParentFrame();
        LoggerUtility.infoTest("The user switch to default IFrame");

        frameMethods.switchSpecificIFrame("frame2");
        LoggerUtility.infoTest("The user switch to a specific IFrame");

    }


}
