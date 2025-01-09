package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MyntraDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");


        WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Actions actions = new Actions(driver);
        actions.moveToElement(men).perform();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


       WebElement tShirt = driver.findElement(By.xpath("//a[text()='T-Shirts'][@data-reactid='345']"));
     //   tShirt.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",tShirt);


    }
}
