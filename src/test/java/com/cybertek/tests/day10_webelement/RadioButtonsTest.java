package com.cybertek.tests.day10_webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
//        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
     /*  default behavior test
         go to http://practice.cybertekschool.com/radio_buttons
         verify that blue is selected
         verify red is not selected
     */

    @Test
    public void test1(){
        WebElement blue = driver.findElement(By.id("blue"));

        //isSelected --> return true if element is selected
        System.out.println(blue.isSelected());

        // verify is the radio button is selected
        Assert.assertTrue(blue.isSelected());

        WebElement red = driver.findElement(By.id("red"));
        //print red is not selected
        System.out.println(red.isSelected());

        // verify if the statement it false. if it is false, it passes. if it is true, it fails.
        Assert.assertFalse(red.isSelected());

    }

    /*
        go to http://practice.cybertekschool.com/radio_buttons
         verify that red is selected
         verify blue is not selected
    */
    @Test
    public void test2(){
        WebElement red = driver.findElement(By.id("red"));
        red.click();
        WebElement blue = driver.findElement(By.id("blue"));
        System.out.println(red.isSelected());
        Assert.assertTrue(red.isSelected());
        System.out.println(blue.isSelected());
        Assert.assertFalse(blue.isSelected());
    }


}
