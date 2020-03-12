package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethodOfXpath {
    public static void main(String[] args) {
        /*
        go to http://practice.cybertekschool.com/context_menu
        verify Context Menu is on the page
         */
        // tagname[text()='exact text']
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebElement emailBox = driver.findElement(By.xpath("h3[text()='Context Menu']"));

        // Verify --> except vs actual
        String expectedText = "Context Menu";
        String actualText= emailBox.getText();
        if (expectedText.equalsIgnoreCase(actualText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
