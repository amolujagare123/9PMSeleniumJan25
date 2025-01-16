package DataProvider;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static DataProvider.util.ForDataProvider.getMyData;

public class AddCustomer2 {

    WebDriver driver;
    @BeforeClass
    public void login()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test (dataProvider = "getData")
    public  void addCustomerTest2(String name,String address
            ,String contact1,String contact2) throws InterruptedException {


        driver.findElement(By.linkText("Add Customer")).click();



        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(    address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);

        driver.findElement(By.name("Submit")).click();

    }

    @DataProvider
    Object[][] getData() throws IOException {


       /* Object[][] data = getMyData("Data/myData2.xlsx", "Sheet2");
        return data;*/

        return getMyData("Data/myData2.xlsx", "Sheet2");

    }
}
