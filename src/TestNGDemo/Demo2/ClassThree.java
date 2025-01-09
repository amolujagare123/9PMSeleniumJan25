package TestNGDemo.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {
    @Test
    public void claasThreeTest1()
    {
        System.out.println("claasThreeTest1");
    }
    @Test(groups = "email")
    public void claasThreeTest2()
    {
        System.out.println("claasThreeTest2");
    }
    @Test
    public void claasThreeTest3()
    {
        System.out.println("claasThreeTest3");
    }
}
