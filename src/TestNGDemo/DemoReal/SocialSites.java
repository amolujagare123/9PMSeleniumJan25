package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends Base {


    @Test (priority = 1)
    public void facebook() {
        driver.get("https://www.facebook.com");
        System.out.println("Navigated to Facebook");
    }

    @Test (priority = 1)
    public void twitter() {
        driver.get("https://www.twitter.com");
        System.out.println("Navigated to Twitter");
    }

    @Test (priority = 3)
    public void instagram() {
        driver.get("https://www.instagram.com");
        System.out.println("Navigated to Instagram");
    }

    @Test
    public void linkedin() {
        driver.get("https://www.linkedin.com");
        System.out.println("Navigated to LinkedIn");
    }


}
