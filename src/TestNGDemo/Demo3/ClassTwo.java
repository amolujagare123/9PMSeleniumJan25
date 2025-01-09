package TestNGDemo.Demo3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
    @Parameters({"url","username","password"})
    @BeforeClass
    public void doLogin(String v1,String v2,String v3)
    {
        System.out.println("url="+v1);
        System.out.println("username="+v2);
        System.out.println("password="+v3);
    }

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
