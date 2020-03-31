package com.cybertek.tests.Naveen_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        System.out.println( driver.getTitle()); // --> getting page title
        System.out.println(driver.getCurrentUrl()); // --> getting page url(web address)
        System.out.println(driver.getPageSource()); // -- getting page HTML all code
        driver.close(); // --> close the current page
        driver.quit(); // --> close the all page


    }
}
