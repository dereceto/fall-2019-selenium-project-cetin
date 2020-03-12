package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTitle {
    public static void main(String[] args) {
        /*
            Amazon Title
        1.Open go to amazon
        2.enter any search term
        3.click on search button
        4.verify page title contains the search term
        5.close browser
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("Monitor Holder");
        WebElement submitButton = driver.findElement(By.className("nav-input"));
        submitButton.click();
        String expectedTitle="Amazon.com: monitor holder";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Title: "+expectedTitle);
            System.out.println("Actual Title: "+actualTitle);
        }
        driver.close();

    }
}
