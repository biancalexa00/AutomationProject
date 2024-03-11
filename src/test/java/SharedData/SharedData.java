package SharedData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SharedData {
    private WebDriver webDriver;

    @BeforeMethod
    public void prepareDriver (){
        webDriver = new ChromeDriver();

        webDriver.get("https://demoqa.com/");

        //maximizarea ferestrei
        webDriver.manage().window().maximize();

    }
    @AfterMethod
    public void clearDriver (){
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
