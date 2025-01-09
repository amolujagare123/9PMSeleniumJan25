package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoFindElements2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

       // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();






        List<WebElement> wbList = driver.findElements(By.className("default-width-input"));

        /*  driver.findElement(By.name("name")).sendKeys("Mahesh");
        driver.findElement(By.name("contact1")).sendKeys("343434");
        driver.findElement(By.name("contact2")).sendKeys("434343434");
        driver.findElement(By.name("address")).sendKeys(    "xyz");*/

        wbList.get(0).sendKeys("Mahesh");
        wbList.get(1).sendKeys("343434");
        wbList.get(2).sendKeys("343434");
        driver.findElement(By.name("address")).sendKeys(    "xyz");
        driver.findElement(By.name("Submit")).click();



    }
}
