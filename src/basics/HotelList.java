package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HotelList {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/searchresults.en-gb.html?ss=Pune&ssne=Pune&ssne_untouched=Pune&sid=8918bb74d902fb87b582710b0a1c8fc6&aid=355028&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=-2108361&dest_type=city&checkin=2025-01-15&checkout=2025-01-17&group_adults=2&no_rooms=1&group_children=0");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[contains(@aria-label,'Dismiss')]")).click();
        driver.navigate().refresh();

        List<WebElement> wbList = driver.findElements(By.className("a15b38c233"));
        System.out.println("size="+ wbList.size());

        for(WebElement wb:wbList)
        {
            System.out.println(wb.getText());
        }


    }
}
