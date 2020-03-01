package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    /*
    1. go to Etsy
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.etsy.com/");
        driver.manage().window().maximize();

        // for verify title --> getTitle();
        // for verify URL   --> getCurrentUrl();
        String expectedURL = "https://www.etsy.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected "+expectedURL);
            System.out.println("The actual URL is: "+actualURL);
        }
        driver.close();

    }
}
