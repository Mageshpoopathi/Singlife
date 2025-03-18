package com.singlife.UIAutomation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver Browser() {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        return new ChromeDriver();
    }

}
