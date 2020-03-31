package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        List<String> urls = Arrays.asList(  "https://luluandgeorgia.com",
                "https://wayfair.com",
                "https://www.westelm.com",
                "https://walmart.com");
        for (String each:urls){
            WebDriver driver = new ChromeDriver();
            driver.get(each);
            String webTitle = driver.getTitle().replace(" ","").toLowerCase().trim();
            String webURL = driver.getCurrentUrl();
            System.out.println(webTitle);
            System.out.println(driver.getCurrentUrl());
            if(webURL.contains(webTitle)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
            Thread.sleep(3000);
            driver.close();
        }

    }
}
