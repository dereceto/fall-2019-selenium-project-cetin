package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        List<String> urls = Arrays.asList(  "http://practice.cybertekschool.com/",
                                            "http://practice.cybertekschool.com/dropdown",
                                            "http://practice.cybertekschool.com/login");
        String expectedTitle="Practice";
        String expectedURL = "http://practice.cybertekschool.com";
        for (String each:urls){
                driver.get(each);
                Thread.sleep(3000);
                if (expectedTitle.equalsIgnoreCase(driver.getTitle())){
                    System.out.println("SAME TITLE");
                }else{
                    System.out.println("DIFFERENT TITLE");
                }
                if (driver.getCurrentUrl().startsWith(expectedURL)){
                    System.out.println("PASS");
                }else{
                    System.out.println("FAIL");
                }
        }

        driver.quit();
    }
}
