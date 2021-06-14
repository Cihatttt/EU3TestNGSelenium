package Day7_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class BeforeAfterMethod {
    @Test
    public void test2(){
        System.out.println("First Test Case");

    }
    @BeforeMethod
    public void setUp(){
        System.out.println("webDriver,Opening Browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Finish");
    }

}
