package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoFindElements {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

       /* WebElement element = driver.findElement(By.tagName("input"));
        // it will get ht e first element with input tag
        element.sendKeys("amolujagare");
        */

        List<WebElement> wbList = driver.findElements(By.tagName("input"));
        System.out.println(wbList.size());

        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");
        wbList.get(2).click();




    }
}
