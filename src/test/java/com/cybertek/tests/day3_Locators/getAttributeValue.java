package com.cybertek.tests.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        // I want to get the value of type attribute
        // type ="text"  --> getAttribute("attribute name");

        // locate username box
        WebElement userName = driver.findElement(By.name("username"));
        String valueOfType = userName.getAttribute("type");
        System.out.println("Value Name: "+valueOfType);
        WebElement submit =driver.findElement(By.id("wooden_spoon"));
        String valueOfButton = submit.getAttribute("class");
        System.out.println(valueOfButton);

    }
}
