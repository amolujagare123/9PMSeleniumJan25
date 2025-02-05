package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo {

    @Test
    public  void addCustomerTest1() throws InterruptedException {


        WebDriver driver = new ChromeDriver();



        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

       /* driver.findElement(By.name("name")).sendKeys("Mahesh");
        driver.findElement(By.name("address")).sendKeys(    "xyz");*/
        driver.findElement(By.name("contact1")).sendKeys("3");
        driver.findElement(By.name("contact2")).sendKeys("4");

        driver.findElement(By.name("Submit")).click();

        /*ArrayList<String> expected = new ArrayList<>();
        expected.add("Please enter a Customer Name".toUpperCase());
        expected.add("Please enter at least 3 characters.".toUpperCase());
        expected.add("Please enter at least 3 characters.".toUpperCase());*/

        ArrayList<String> expected = new ArrayList<>(){{
            add("Please enter a Customer Name".toUpperCase());
            add("Please enter at least 3 characters.".toUpperCase());
            add("Please enter at least 3 characters.".toUpperCase());
        }};

        ArrayList<String> actual = new ArrayList<>();

        try
        {
            List<WebElement> wbList = driver.findElements(By.cssSelector("label.error"));

            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
            actual.add(wbList.get(2).getText());
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");



    }

    @Test
    public  void addCustomerTest2() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        String name = "Mahesh4";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(    "xyz");
        driver.findElement(By.name("contact1")).sendKeys("334343");
        driver.findElement(By.name("contact2")).sendKeys("4434343");

        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";
       String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");



    }
}
