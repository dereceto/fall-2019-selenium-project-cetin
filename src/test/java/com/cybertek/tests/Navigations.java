package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {
        // binary the driver and browser
        WebDriverManager.chromedriver().setup();
        // WebDriver object --> Interface
        // I have a driver
        WebDriver driver = new ChromeDriver();

        // I want to see full size windows

        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        /*
        NAVIGATION:
            driver.navigate().to("URL);
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
         */
        //navigate().forward()
        // go to practice --> than go to google --> than back to practice --> forward to go google
        driver.get("http://practice.cybertekschool.com/");
         Thread.sleep(3000); // we used sleep() for we can see to what is changing
        driver.navigate().to("https://www.google.com");
         Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        // close drive
        //close the current web browser ONLY
        // sadece o anda calistigin sekmeyi kapatir
        driver.close();
        // quit drive (it is close to all of the web browser)
        // close down all the windows in a browser
        // butun sekmeleri kapatir.
        driver.quit();



    }
}
