package day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {


    WebDriver driver= WebDriverFactory.getdriver("chrome");
    driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement link1= driver.findElement(By.linkText("selamaleykum"));
        link1.click();
}
}
