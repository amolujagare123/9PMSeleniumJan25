package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        // 1. find the element
        WebElement drpList = driver.findElement(By.id("seltext"));

        // 2. create the object of select class
        Select selList = new Select(drpList);

        Thread.sleep(4000);
        // 3. select the element
       // selList.selectByVisibleText("text 2");
       // selList.selectByValue("v12");
        selList.selectByIndex(4);



    }
}
