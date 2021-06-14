package day3_webelemnt_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class verifyURLchanged {
    public static void main(String[]args){
        WebDriver driver= WebDriverFactory.getdriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emilInputBox=driver.findElement(By.name("e mail"));
        emilInputBox.sendKeys("cihat.gmail.com");

        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));

        String ecpectedUrl="http://practice.cybertekschool.com/forgot_password";
        String actualUrl= driver.getCurrentUrl();

        if(ecpectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();
    }

}
