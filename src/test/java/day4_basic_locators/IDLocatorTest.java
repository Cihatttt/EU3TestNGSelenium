package day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {
    public static void main (String[] args){
        WebDriver driver= WebDriverFactory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton= driver.findElement(By.id("disappearing button"));
        dontClickButton.click();
    }
}
