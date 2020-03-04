package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    /*
    1. go to goole website
    2. save the title in a String variable
    3. go to Etsy
    4.Save the Etsy title in a string
    5.Navigate back to previuuse page
    6. Verify the title is same as step 2
    7. Navigate forward to previoud page
    8. Verify the title is same as step 4
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String exceptedGoogleTitle ="Google";
        driver.navigate().to("https://www.etsy.com/?ref=lgo");
        String exceptedEtsyTitle ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();
        if(exceptedGoogleTitle.equals(driver.getTitle())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Google Excepted Title is: "+exceptedGoogleTitle);
            System.out.println("Google actual Title is: "+driver.getTitle());
        }
        driver.navigate().forward();
        if (exceptedEtsyTitle.equals(driver.getTitle())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ETSY Excepted Title is: "+exceptedEtsyTitle);
            System.out.println("ETSY actual Title is: "+driver.getTitle());
        }
        driver.close();

    }
}
