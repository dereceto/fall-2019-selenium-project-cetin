package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        /*
        1. go to cybertek practice web site
        2. Verify Title
        excepted title: Practice
        Actual Title --> ?

        http://practice.cybertekschool.com/
         */
        // Connect browser and driver
        // setup browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();  // ekrani tam ekran yapmak icin

        String expectedTitle = "practice";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The Actual title is "+ actualTitle);
        }

        driver.get("https://www.etsy.com/?ref=lgo");
        driver.manage().window().maximize();

        String expectedEtsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualEtsyTitle = driver.getTitle();

        if(expectedEtsyTitle.equals(actualEtsyTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected " + expectedEtsyTitle);
            System.out.println("The Actual title is "+ actualEtsyTitle);
        }

        driver.close();

    }
}
