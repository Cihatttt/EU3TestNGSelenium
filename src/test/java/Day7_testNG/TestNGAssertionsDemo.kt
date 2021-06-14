package Day7_testNG

import org.testng.Assert
import org.testng.annotations.Test

public class TestNGAssertionsDemo {
    @Test
    public void test1(){
        Assert.assertEquals("title","title");

    }
}