package JunitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJunitDemo2 {
    WebDriver driver;
    @Before // this method will execute before every test
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After// this method will execute  after  every test
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
       driver.close();
    }


    @Test
    public  void myTest1() throws InterruptedException {



        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
      //  btnLogin.click();


    }
    @Test
    public  void myTest2() throws InterruptedException {



        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("dsdsd");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("dsdsds");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
      //  btnLogin.click();


    }
    @Test
    public  void myTest3() throws InterruptedException {



        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
       // btnLogin.click();


    }
}
