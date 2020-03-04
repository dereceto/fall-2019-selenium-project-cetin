package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        /*
        1. go to cybertek practice website
        2. verify the URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        String exceptURL = "http://practice.cybertekschool.com/";
        String actualURL = driver.getCurrentUrl();
        if (exceptURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Excepted Cybertek Practice "+exceptURL);
            System.out.println("Actual Cybertek Practice: "+actualURL);
        }

        driver.get("");
        driver.close();
    }
}
