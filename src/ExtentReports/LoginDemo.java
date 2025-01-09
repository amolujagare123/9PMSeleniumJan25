package ExtentReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ExtentReports.util.ForExtentReport.getTheScreenshot;
import static ExtentReports.util.ForExtentReport.getTheScreenshot2;

public class LoginDemo {

    ExtentReports extent;
    @BeforeClass
    public void initReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("HR System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Dev name","Vidya");
        extent.setSystemInfo("QA","Saniya");
        extent.setSystemInfo("Environment","windows 11 , Chrome");
        extent.setSystemInfo("Server","Staging");
        extent.setSystemInfo("Database","MySQL");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }


    @Test
    public  void myTest1() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin1");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

        test.info("login button clicked");

        WebElement element = null;

        String expected = "Dashboard";
        String actual = "";
        try {
            element = driver.findElement(By.xpath("//*[@alt='Point of Sale']"));
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();



        }
        catch (Exception e)
        {

        }

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("We are on Dashboard");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());

            test.addScreenCaptureFromPath("./screenshots/"+getTheScreenshot2(driver,element));
        }

    }

    @Test
    public  void myTest2() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin1");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

        test.info("login button clicked");


        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e) {
        }

            try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
                test.pass("We got the error");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getTheScreenshot(driver));
        }

    }

    @Test
    public  void myTest3() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

        test.info("login button clicked");


        ArrayList<String> expected = new ArrayList<>();
        expected.add("Please enter a username".toUpperCase());
        expected.add("Please provide a password".toUpperCase());

        ArrayList<String> actual = new ArrayList<>();
        String actual1 = "";
        String actual2 = "";
        try
        {
            List<WebElement> wbList = driver.findElements(By.xpath("//label[@class='error']"));

            actual1 = wbList.get(0).getText();
            actual2 = wbList.get(1).getText();

            actual.add(actual1);
            actual.add(actual2);
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("We got the error");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getTheScreenshot(driver));
        }

    }
}

