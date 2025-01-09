package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        driver.navigate().to("http://gmail.com");

        Thread.sleep(2000);

       driver.navigate().back();

        Thread.sleep(2000);
       driver.navigate().forward();

        Thread.sleep(2000);
       driver.navigate().refresh();


    }
}
