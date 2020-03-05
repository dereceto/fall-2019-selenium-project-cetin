package com.cybertek.tests.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
    public static void main(String[] args) throws InterruptedException {
        // locaotors --> ID, name, classname,
        // if class attribute's value has a spase or spaces,
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        //Keys.ENTER --> click the Enter key
        searchBox.sendKeys("shoes"+ Keys.ENTER);

//        WebElement searchBttn =driver.findElement(By.id("gh-btn"));
//        searchBox.click();

        // Verify title contains search term
        // Excepted vs actual
        Thread.sleep(3000);
        String exceptedPartialTitle = "shoes";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(exceptedPartialTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
