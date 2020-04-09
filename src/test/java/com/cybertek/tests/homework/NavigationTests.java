package com.cybertek.tests.homework;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String googleTitle=driver.getTitle();
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();

        driver.navigate().forward();
        if (etsyTitle.equalsIgnoreCase(driver.getTitle())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }


}
