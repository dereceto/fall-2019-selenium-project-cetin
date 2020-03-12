package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        // go to practice login page
        // locate email box with absolute xpath
        // locate username box with relative xpath
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // absolute xpath
        WebElement emailBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input"));
        emailBox.sendKeys("tom");
        // relative xpath
        // formula: tagname[@attribute="value"]
        // <input type="text" name="username">
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("serto");




    }
}
