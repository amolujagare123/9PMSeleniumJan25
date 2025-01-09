package TestNGDemo.Demo3;

import org.testng.annotations.*;

public class ClassOne {



    @Parameters({"url","username","password"})
    @BeforeClass
    public void doLogin(String v1,String v2,String v3)
    {
        System.out.println("url="+v1);
        System.out.println("username="+v2);
        System.out.println("password="+v3);
    }


    @Test
    public void claasOneTest1()
    {
        System.out.println("claasOneTest1");
    }
    @Test
    public void claasOneTest2()
    {
        System.out.println("claasOneTest2");
    }
    @Test
    public void claasOneTest3()
    {
        System.out.println("claasOneTest3");
    }
}
