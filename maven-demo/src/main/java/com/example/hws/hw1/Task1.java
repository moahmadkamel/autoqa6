package com.example.hws.hw1;
import java.util.Set;

// import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.NoSuchElementException;
import com.example.driverFactory.DriverSetUp;

public class Task1 {
    /*
    Write a program that will open four different pages in new windows:
    https://zoo.kiev.ua/
    https://www.w3schools.com/
    https://taxi838.ua/ru/dnepr/
    https://klopotenko.com/
    Write a cycle that will switch through all pages one by one,
    For each page, display the name and link to this page in the console.
    And it will close the page whose title contains the word zoo.
    */

    /*
    public static void acceptCookies(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id(""));
        acceptCookies.click();
        Thread.sleep(5000);
    }
    */
    
    public static void openLinkInANewTab(WebDriver driver, String url){
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get(url);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://dan-it.com.ua/uk/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        openLinkInANewTab(driver, "https://zoo.kyiv.ua/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        openLinkInANewTab(driver, "https://rozetka.com.ua/");
        // Thread.sleep(15000);
        /*
        try {
            acceptCookies(driver);
        } catch (NoSuchElementException e) {
            System.out.println("Cookies not found");
        }
        */

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        openLinkInANewTab(driver,"http://www.automationpractice.pl/index.php");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        Set<String> handlers = driver.getWindowHandles();
        for (String handler: handlers){
            driver.switchTo().window(handler);
            if(driver.getTitle().contains("зоо")){
                driver.close();
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
