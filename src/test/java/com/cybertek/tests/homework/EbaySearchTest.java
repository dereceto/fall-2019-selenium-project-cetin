package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EbaySearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("wooden spoon"+ Keys.ENTER);
        String result=driver.findElement(By.xpath("//h1/span")).getText().replace(",","");
        int resultInt=Integer.parseInt(result);

        driver.findElement(By.xpath("//a[@href='https://www.ebay.com/sch/i.html?_from=R40&_nkw=wooden+spoon&_oac=1']")).click();
        String allResult=driver.findElement(By.xpath("//h1/span")).getText().replace(",","");
        int allResultInt=Integer.parseInt(allResult);
        if (allResultInt>resultInt){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.navigate().back();
        driver.findElement(By.id("gh-ac")).clear();
        Thread.sleep(5000);
        if (driver.findElement(By.id("gh-ac")).isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }
}
