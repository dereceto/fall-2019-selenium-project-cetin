package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaURL {
    public static void main(String[] args) {
        /*
        1.Go to wikipedia.org
        2.enter search term selenium webdriver
        3.click on search button
        4.click on search result Selenium (software)
        5.verify url ends with Selenium_(software)
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        WebElement wikipediaSearchTemp=driver.findElement(By.id("searchInput"));
        wikipediaSearchTemp.sendKeys("selenium webdriver");
        WebElement searchButton = driver.findElement(By.id("searchInput"));
        searchButton.click();




    }
}
