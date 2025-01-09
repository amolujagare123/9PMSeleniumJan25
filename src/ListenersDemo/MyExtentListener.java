package ListenersDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static ExtentReports.util.ForExtentReport.initExtent;

public class MyExtentListener implements ITestListener
{
    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("this test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.fail(result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip(result.getThrowable());
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
           extent = initExtent();
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();
    }
}
