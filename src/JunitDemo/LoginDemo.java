package JunitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https1://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername1 = driver1.findElement(By.cssSelector("#login-username"));
        txtUsername1.sendKeys("dsdsd");

        WebElement txtPassword1 = driver1.findElement(By.cssSelector("#login-password"));
        txtPassword1.sendKeys("dsdsds");

        WebElement btnLogin1 = driver1.findElement(By.cssSelector("input[type='submit']"));
        btnLogin1.click();



        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername2 = driver2.findElement(By.cssSelector("#login-username"));
        txtUsername2.sendKeys("admin");

        WebElement txtPassword2 = driver2.findElement(By.cssSelector("#login-password"));
        txtPassword2.sendKeys("admin");

        WebElement btnLogin2 = driver2.findElement(By.cssSelector("input[type='submit']"));
        btnLogin2.click();


    }
}
