package AssertionDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginTestNG1 {

    @Test
    public  void myTest1() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

       /* String expected = "https://stock.scriptinglogic.in/dashboard.php";
        String actual = driver.getCurrentUrl();*/

      /*  String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"this is not a dashboard");


    }
    @Test
    public  void myTest2() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }
    @Test
    public  void myTest3() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Please enter a username".toUpperCase());
        expected.add("Please provide a password".toUpperCase());

        ArrayList<String> actual = new ArrayList<>();

        String actual1="";
        String actual2="";
        try
        {
            actual1 =  driver.findElement(By.xpath("//label[@for='login-username' and @class='error']")).getText();
            actual2 =  driver.findElement(By.xpath("//label[@for='login-password' and @class='error']")).getText();

            actual.add(actual1);
            actual.add(actual2);
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public  void myTest4() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

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

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }


}
