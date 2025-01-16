package DataProvider;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static DataProvider.util.ForDataProvider.getMyData;

public class LoginTestNGExxHd2 {

    @Test (dataProvider = "getData")
    public  void myTest1(String username,String password) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.cssSelector("input[type='submit']"));
        btnLogin.click();


    }

    @DataProvider
    Object[][] getData() throws IOException {

        return getMyData("Data/myData2.xlsx","Sheet3");
    }

}
