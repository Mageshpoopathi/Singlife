package com.singlife.UIAutomation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver Browser() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
