package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tryHWork {
    WebDriver driver;
    Actions action;

    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverFactory.getDriver("firefox");
        action = new Actions(driver);
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement target = driver.findElement(By.tagName("img"));
        action.moveToElement(target).perform();
        Thread.sleep(5000);

    }

    @Test
    public void menu(){
        driver.get("http://practice.cybertekschool.com/jqueryui/menu");
        WebElement enabled=driver.findElement(By.id("ui-id-3"));
        WebElement download=driver.findElement(By.id("ui-id-4"));
        WebElement pdf = driver.findElement(By.id("ui-id-5"));
        action.moveToElement(enabled).pause(2000).moveToElement(download).pause(2000).click(pdf).build().perform();

    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement first = driver.findElement(By.id("draggable"));
        WebElement second = driver.findElement(By.id("droptarget"));
        Thread.sleep(5000);
        action.dragAndDrop(first,second).perform();
        Thread.sleep(5000);


    }
}
