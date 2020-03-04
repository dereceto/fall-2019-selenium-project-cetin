package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        //Locator 1. ID

        //go to Cybertek okta login page
        //write email to the text box
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the text box
        /*
        1. Find the text box first --> findElement() from WebDriver

         */
        WebElement emailBox =driver.findElement(By.id("okta-signin-username"));
        emailBox.sendKeys("cetinderedc@gmail.com");

    }
}
