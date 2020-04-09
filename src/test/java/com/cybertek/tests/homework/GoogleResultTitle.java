package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class GoogleResultTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
//        driver.findElement(By.name("q")).sendKeys("java"+ Keys.ENTER);
//        String firstUrl=driver.getCurrentUrl();
//        System.out.println(firstUrl);
//        driver.findElement(By.cssSelector("div.rc")).click();
//        if(firstUrl.equalsIgnoreCase(driver.getCurrentUrl())){
//            System.out.println("PASS");
//        }else{
//            System.out.println("FAIL");
//        }
//        driver.navigate().back();
        List<String> searchStrs = Arrays.asList("Java", "cucumber bdd","Selenium web browser automation" );
        for (String each : searchStrs) {
            driver.findElement(By.name("q")).sendKeys(each+ Keys.ENTER);
            String actualURL=driver.getCurrentUrl();
            driver.findElement(By.cssSelector("div.rc")).click();
            if(actualURL.equalsIgnoreCase(driver.getCurrentUrl())){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
            driver.navigate().back();

        }

    }
}
