package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvoicePlaneDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        WebElement txtUsername = driver.findElement(By.id("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPwd = driver.findElement(By.id("password"));
        txtPwd.sendKeys("admin123");

        driver.findElement(By.xpath("//button")).click();

        driver.findElement(By.xpath("//*[text()='Clients']")).click(); // clients
        driver.findElement(By.xpath("//*[text()='View Clients']")).click(); // view clients


        String name = "Aditi Verma";


      driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click(); // options
      driver.findElement(By.xpath("//tr[td[a[text()='"+name+ "']]]//i[contains(@class,'edit')] ")).click(); // Edit


    }
}
