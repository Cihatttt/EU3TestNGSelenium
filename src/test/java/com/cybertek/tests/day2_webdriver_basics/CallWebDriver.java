package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriver {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getdriver("firefox");
        driver.get("htpps://www.google.com");
        String title=driver.getTitle();
        System.out.println("title="+title);
    }
}
