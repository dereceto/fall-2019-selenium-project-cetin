package com.cybertek.tests.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        // Locator linkText
        // <a> a tag is link. in this situation, we will use linkText locator
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();

        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 secon"));
        String textVersionOfExample = example3.getText();
        System.out.println(textVersionOfExample);

        //linkText vs partialLinkText
        //I want to locate Example3 with only a part of it

        WebElement example3_2= driver.findElement(By.partialLinkText("Example 3:"));
        String text = example3_2.getText();
        System.out.println(text);

        // locate Cybertek_School
        // i can not print the above variable cybertekschool because it is a WebElement
        WebElement cybertekSchool = driver.findElement(By.linkText("Cybertek School"));
        // in order to print, I need getText();
        String cySchool = cybertekSchool.getText();
        System.out.println(cySchool);

        // 


    }
}
