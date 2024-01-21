package com.example.hws.hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.example.driverFactory.DriverSetUp;
import com.example.utils.ActionsClass;

public class ParametersTask5 {
       static WebDriver driver;
    static ActionsClass actionsClass;

    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }

    @Test
    @Parameters({"search1", "search2", "search3", "search4"})
    public void searchTest(String search1, String search2, String search3, String search4) throws InterruptedException {
        driver.get("https://www.foxtrot.com.ua/");
        try {
            actionsClass.click(By.xpath("//div[@id='user-location-popup']/div/div/i"));
        } catch (Exception e) {
            System.out.println("No button \"location\"");
        }
        actionsClass.sendKeys(By.xpath("//input[@type='search']"), search1);
        Thread.sleep(3000);
        actionsClass.click(By.xpath("//input[@type='button']"));
        Thread.sleep(3000);
        System.out.println("Test one suite param is: " + search1);
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='page__title']>h1")).getText().contains(search1));


        actionsClass.sendKeys(By.xpath("//input[@type='search']"), search2);
        Thread.sleep(3000);
        actionsClass.click(By.xpath("//input[@type='button']"));
        Thread.sleep(3000);
        System.out.println("Test two suite param is: " + search2);
        Assert.assertTrue(
                driver.findElement(By.cssSelector("div[class='page__title']>h1")).getText().contains(search2));
        

        actionsClass.sendKeys(By.xpath("//input[@type='search']"), search3);
        Thread.sleep(3000);
        actionsClass.click(By.xpath("//input[@type='button']"));
        Thread.sleep(3000);
        System.out.println("Test three suite param is: " + search3);
        Assert.assertTrue(
                driver.findElement(By.cssSelector("div[class='page__title']>h1")).getText().contains(search3));
                
        
        actionsClass.sendKeys(By.xpath("//input[@type='search']"), search4);
        Thread.sleep(3000);
        actionsClass.click(By.xpath("//input[@type='button']"));
        Thread.sleep(3000);
        System.out.println("Test four suite param is: " + search4);
        Assert.assertFalse(
                driver.findElement(By.cssSelector("div[class='page__title']>h1")).getText().contains(search4));        
    }
}
