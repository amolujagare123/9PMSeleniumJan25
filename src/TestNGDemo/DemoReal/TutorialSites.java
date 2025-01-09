package TestNGDemo.DemoReal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites  extends Base {


    @Test
    public void w3schools() {
        driver.get("https://www.w3schools.com");
        System.out.println("Navigated to W3Schools");
    }

    @Test
    public void tutorialspoint() {
        driver.get("https://www.tutorialspoint.com");
        System.out.println("Navigated to TutorialsPoint");
    }

    @Test
    public void geeksForGeeks() {
        driver.get("https://www.geeksforgeeks.org");
        System.out.println("Navigated to GeeksForGeeks");
    }

    @Test
    public void coursera() {
        driver.get("https://www.coursera.org");
        System.out.println("Navigated to Coursera");
    }


}
