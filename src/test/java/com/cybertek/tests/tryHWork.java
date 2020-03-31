package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryHWork {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.amazon.com/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("water"+ Keys.ENTER);
        WebElement firstItem = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        String firstItemName=firstItem.getText();
        firstItem.click();
        WebElement productTitle = driver.findElement(By.id("productTitle"));
        String productTitleText = productTitle.getText();
        if (firstItemName.equalsIgnoreCase(productTitleText)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }



    }
}
