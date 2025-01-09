package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

    static WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
