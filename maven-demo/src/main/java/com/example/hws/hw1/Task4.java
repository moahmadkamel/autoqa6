package com.example.hws.hw1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.driverFactory.DriverSetUp;

public class Task4 {
     /*
    Write a program that will repeat the actions in the video
    “HW_AUTOMATION_LESSON_3_UPDATE.mp4”.
    http://www.automationpractice.pl/index.php
    */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(4000);
        String inputForSearch = "Printed Chiffon Dress";
        driver.findElement(By.id("search_query_top")).sendKeys(inputForSearch);
        Thread.sleep(4000);
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@title='Printed Chiffon Dress'])[2]")).click();
        // driver.findElement(By.xpath("(//a[@class='product-name'][@title='Printed Chiffon Dress'])[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@title='Women'])[1]")).click();
        Thread.sleep(4000);

        String inputForSearch2 = "Faded Short";
        driver.findElement(By.id("search_query_top")).sendKeys(inputForSearch2);
        Thread.sleep(4000);
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
