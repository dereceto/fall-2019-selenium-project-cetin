package com.cybertek.base;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
