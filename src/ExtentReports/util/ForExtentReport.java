package ExtentReports.util;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ForExtentReport {


    public static String getTheScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it. type cast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using ts
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile, new File("Report\\screenshots\\"+fileName));

        return fileName;
    }
    public static String getExtentScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it. type cast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using ts
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile, new File("Report2\\screenshots\\"+fileName));

        return fileName;
    }

    public static String getTheScreenshot2(WebDriver driver, WebElement element) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it. type cast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using ts or using element

        File scrFile = null;
        if(element==null)

             scrFile = ts.getScreenshotAs(OutputType.FILE);

        else
             scrFile = element.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile, new File("Report\\screenshots\\"+fileName));

        return fileName;
    }


    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report2/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("HR System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Dev name","Vidya");
        extent.setSystemInfo("QA","Saniya");
        extent.setSystemInfo("Environment","windows 11 , Chrome");
        extent.setSystemInfo("Server","Staging");
        extent.setSystemInfo("Database","MySQL");

        return extent;
    }
}
