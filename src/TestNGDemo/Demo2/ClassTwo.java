package TestNGDemo.Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void claasTwoTest1()
    {
        System.out.println("claasTwoTest1");
    }
    @Test(groups = "email")
    public void claasTwoTest2()
    {
        System.out.println("claasTwoTest2");
    }
    @Test
    public void claasTwoTest3()
    {
        System.out.println("claasTwoTest3");
    }
}
