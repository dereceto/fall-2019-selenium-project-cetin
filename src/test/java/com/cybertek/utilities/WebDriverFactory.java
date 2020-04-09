package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    // write a static return method which returns WebDriver
    // name: getDriver
    // it takes a String as a parameter --> browser type
    // return ChromeDriver and OperaDriver
    public static WebDriver getDriver(String browserType){
    // 1. way with If-else
        // local variable
        WebDriver driver = null;
//        if (browserType.equalsIgnoreCase("Chrome")){
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }else{
//            WebDriverManager.operadriver().setup();
//            driver = new OperaDriver();
//        }
        // 2. way with switch case
        switch (browserType){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
        }
        return driver;
    }
}
