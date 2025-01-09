package TestNGDemo.Demo2;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeGroups("email")
    public void beforeMyGroup()
    {
        System.out.println("beforeMyGroup email");
    }

    @AfterGroups("email")
    public void afterMyGroup()
    {
        System.out.println("afterMyGroup email");
    }




    @Test (groups = "email")
    public void claasOneTest1()
    {
        System.out.println("claasOneTest1");
    }
    @Test (groups = "email")
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
