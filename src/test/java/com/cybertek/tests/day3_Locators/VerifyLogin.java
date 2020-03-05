package com.cybertek.tests.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) throws InterruptedException {
        // http://practice.cybertekschool.com/login
        //Go to login page
        // enter user name
        // enter password
        //click login botton
        // when you see "Welcome to the Secure Area. When you are done click logout below"
        //click Logout
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        /* AQ:
                How do you locate when there is no attributes of an element?
                How do you locate if the element has ONLY Text massage
         */
        // locating the welcome massage with tagname
        WebElement welcomeMassage = driver.findElement(By.tagName("h4"));
        // Verify the welcome massage
        // excepted massage
        String exceptedMassage = "Welcome to the Secure Area. When you are done click logout below.";


        // actual massage
        // getText() --> convert webElement to string
        String actualWelcomeMassage=welcomeMassage.getText();

        if (exceptedMassage.equals(actualWelcomeMassage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
