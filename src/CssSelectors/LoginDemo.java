package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();


        driver.findElement(By.cssSelector("a[href*='add_cust']")).click();

        driver.findElement(By.cssSelector("#name")).sendKeys("Mahesh");
            driver.findElement(By.cssSelector("[name='address']")).sendKeys(    "xyz");
        driver.findElement(By.cssSelector("[name=contact1]")).sendKeys("343434");
        driver.findElement(By.cssSelector("[name=contact2]")).sendKeys("434343434");

        driver.findElement(By.cssSelector("[type='submit']")).click();



    }
}
