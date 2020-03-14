package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tryHWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com/");
        WebElement googleText = driver.findElement(By.name("q"));
        googleText.sendKeys("amazon");
        googleText.submit();
        Thread.sleep(2000);
        //burada
        WebElement amazonLink = driver.findElement(By.cssSelector(".LC20lb.DKV0Md"));
        amazonLink.click();
        Thread.sleep(2000);
        //bunu ekledim
        WebElement amzSingInBtt=driver.findElement(By.id("nav-link-accountList"));
        amzSingInBtt.click();
        Thread.sleep(2000);
//        WebElement amazonHelloSignIn = driver.findElement(By.xpath("//header/div/div[1]/div[2]/div/a[2]/span[2]/span"));
//        amazonHelloSignIn.submit();
//        WebElement account = driver.findElement(By.id("nav-link-accountList"));
//        Actions action = new Actions(driver);
//        action.moveToElement(amzSingInBtt).perform();
//        Thread.sleep(2000);
//        action.click();
//        WebElement amazonLogin = driver.findElement(By.className("nav-action-button"));
//        amazonLogin.click();
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("cetinberkadem@gmail.com");
        Thread.sleep(2000);
        email.submit();
        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("rojhat76");
        Thread.sleep(2000);
        password.submit();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Cat Food");
        searchBox.submit();
        Thread.sleep(5000);
        WebElement lowRate = driver.findElement(By.id("a-autoid-0-announce"));
        lowRate.click();
        Thread.sleep(2000);
        WebElement lowRate2 = driver.findElement(By.id("s-result-sort-select_1"));
        lowRate2.click();
        Thread.sleep(2000);
        WebElement chooseBrand = driver.findElement(By.id("p_89/Purina Friskies"));
        Thread.sleep(2000);
        chooseBrand.click();
        WebElement selectItem = driver.findElement(By.cssSelector("img[src='https://m.media-amazon.com/images/I/819k43k6jDL._AC_UL320_ML3_.jpg'"));
        selectItem.click();
        WebElement oneTimeBuyBox = driver.findElement(By.id("buybox-see-all-buying-choices-announce"));
        oneTimeBuyBox.click();
        WebElement addToCart =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[6]/div[5]/div[1]/div[2]/div/div/div/form/div/div/div[2]/span/span/span/div/div/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/span/span"));
        addToCart.click();



    }
}
