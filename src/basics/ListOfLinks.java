package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        List<WebElement> wbList = driver.findElements(By.tagName("a"));

        System.out.println("Total links = "+wbList.size());

        for(WebElement wb:wbList)
        {
            System.out.println(wb.getText());
        }
    }
}
