package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookit {
    public static void main(String[] args) {
        /*
        Task 1:
            1. Go to Bookit login page
                https://cybertek-reservation-qa.herokuapp.com/sign-in
            2. Verify the title of the page
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        String exceptedTitle="bookit";
        String actualTitle=driver.getTitle();
        if (exceptedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Excepted Title: "+exceptedTitle);
            System.out.println("Actual Title: "+driver.getTitle());
        }
        /*
        Task 2.
            1. Go to Bookit login page
                https://cybertek-reservation-qa.herokuapp.com/sign-in
            2. Verify that URL contains “cybertek-reservation”

         */
        String exceptedPartialURL="cybertek-reservation";
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains(exceptedPartialURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Excepted Partial URL: "+exceptedPartialURL);
            System.out.println("Actual URL: "+actualURL);
        }
        driver.close();
    }
}
