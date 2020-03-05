package com.cybertek.tests.day3_Locators;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakerPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Create from Faker class object
        Faker fakerData = new Faker();

        // I need firstname
        String name = fakerData.name().firstName();
        String lastName = fakerData.name().lastName();
        String userName = fakerData.name().username();

        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(name+lastName);
        driver.findElement(By.id("wooden_spoon")).click();


    }
}
