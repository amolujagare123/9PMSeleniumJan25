package TestNGDemo.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {
    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }
    @Test
    public void claasTwoTest1()
    {
        System.out.println("claasTwoTest1");
    }
    @Test
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
