package TestNGDemo.DemoReal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {

    private WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
        System.out.println("Navigated to Indeed");
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
        System.out.println("Navigated to Glassdoor");
    }

    @Test
    public void monster() {
        driver.get("https://www.monster.com");
        System.out.println("Navigated to Monster");
        Assert.assertEquals(driver.getTitle(),
                "monster",
                "The title is different");
    }

    @Test
    public void linkedinJobs() {
        driver.get("https://www.linkedin.com/jobs");
        System.out.println("Navigated to LinkedIn Jobs");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
