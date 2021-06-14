package Day5UnderScoreXpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {


    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getdriver("chrome");
        driver.get("https://amazon.com");
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchbox']"));
        searchbox.sendKeys("selenium");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
    }
}
