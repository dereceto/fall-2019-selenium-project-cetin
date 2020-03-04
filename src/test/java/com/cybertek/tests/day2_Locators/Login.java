package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();
        /*
        User Story: As a user, I shoul be able to login VyTrack app.

        1. go to VyTrack login page
        2. write username data: storemanager52
        3. write password: UserUser123
        4.click login button
         */
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        // Verify that you are in the home page
        String exceptedURL="https://app.vytrack.com/";
        String actualURL=driver.getCurrentUrl();
        if (exceptedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Excepted URL: "+exceptedURL);
            System.out.println("Actual URL: "+actualURL);
        }
    }
}
