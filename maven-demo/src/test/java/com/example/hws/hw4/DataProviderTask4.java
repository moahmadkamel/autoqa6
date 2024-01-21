package com.example.hws.hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.driverFactory.DriverSetUp;
import com.example.utils.ActionsClass;

public class DataProviderTask4 {
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

    @Test(dataProvider = "searchParameters")
    public void searchTest(String search) throws InterruptedException {
        driver.get("https://www.foxtrot.com.ua/");
        try {
            actionsClass.click(By.xpath("//div[@id='user-location-popup']/div/div/i"));
        } catch (Exception e) {
            System.out.println("No button \"location\"");
        }
        actionsClass.sendKeys(By.xpath("//input[@type='search']"), search);
        Thread.sleep(1500);
        actionsClass.click(By.xpath("//input[@type='button']"));
        Thread.sleep(1500);
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='page__title']>h1")).getText().contains(search));
    }

    @DataProvider(name = "searchParameters")
    public Object[][] createData() {
        return new Object[][]{
                {"machine"},
                {"input"},
                { "meaning" },
                { "handball" },
        };
    }
}
