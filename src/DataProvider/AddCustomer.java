package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCustomer {

    WebDriver driver;
    @BeforeClass
    public void login()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public  void addCustomerTest2() throws InterruptedException {





        driver.findElement(By.linkText("Add Customer")).click();

        String name = "Mahesh4";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(    "xyz");
        driver.findElement(By.name("contact1")).sendKeys("334343");
        driver.findElement(By.name("contact2")).sendKeys("4434343");

        driver.findElement(By.name("Submit")).click();

    }
}
