package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryHWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds")).click();
       // driver.findElement(By.name("password")).sendKeys("SuperSecretPassword" + Keys.ENTER);
    }
}
