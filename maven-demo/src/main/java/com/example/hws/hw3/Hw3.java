package com.example.hws.hw3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.example.driverFactory.DriverSetUp;

public class Hw3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.google.com/search");
        Thread.sleep(9000);
        String inputForSearch = "https://www.guinnessworldrecords.com/account/register?";
        //driver.findElement(By.cssSelector("div[class='DPXIy']>textarea")).sendKeys("https://www.guinnessworldrecords.com/account/register?");
        WebElement searchField = driver.findElement(By.id("APjFqb"));
        searchField.sendKeys(inputForSearch);
        Thread.sleep(6000);
        //driver.findElement(By.cssSelector("div[class='DPXIy']>textarea")).sendKeys(Keys.ENTER);
        searchField.sendKeys(Keys.ENTER);
        // driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc']>center>input[value='Google Search']")).click(); // main page google seach button
        Thread.sleep(9000);

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.cssSelector(
                "div[class='yuRUbf']>div>span>a[href='https://www.guinnessworldrecords.com/account/register']")))
                .perform();
        actions.pause(Duration.ofSeconds(2)).perform();
        actions.keyDown(Keys.COMMAND).perform();
        driver.findElement(By.cssSelector(
                "div[class='yuRUbf']>div>span>a[href='https://www.guinnessworldrecords.com/account/register']"))
                .click();
        actions.keyUp(Keys.COMMAND).perform();
        actions.pause(Duration.ofSeconds(9)).perform();
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='M2vV3 vOY7J']"))).perform();
        actions.pause(Duration.ofSeconds(2)).perform();
        // driver.findElement(By.cssSelector(".M2vV3.vOY7J")).click();
        driver.findElement(By.xpath("//div[@class='M2vV3 vOY7J']")).click();
        actions.pause(Duration.ofSeconds(2)).perform();
        driver.findElement(By.id("APjFqb")).click();
        actions.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html").perform();
        actions.pause(Duration.ofSeconds(2)).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.pause(Duration.ofSeconds(5)).perform();
        actions.keyDown(Keys.COMMAND).perform();
        driver.findElement(
                By.cssSelector("div[class='yuRUbf']>div>span>a[href='https://www.hyrtutorials.com/p/alertsdemo.html']"))
                .click();
        actions.keyUp(Keys.COMMAND).perform();
        //String thirdWindow = driver.getWindowHandle();
        actions.pause(Duration.ofSeconds(9)).perform();
        /////////////////////////////
        // driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        // String originalWindow = driver.getWindowHandle();
        // System.out.println("w3schools window id : " + originalWindow);

        /*
        try {
            driver.findElement(By.id("")).click();
        } catch (Exception e) {
            System.out.println("No button \"accept-all\"");
        }
        */

        Thread.sleep(9000);
        driver.switchTo().frame("iframeResult");
        WebElement fName = driver.findElement(By.id("fname"));
        fName.click();
        fName.clear();
        Thread.sleep(6000);
        fName.sendKeys("mo");
        Thread.sleep(6000);
        WebElement lName = driver.findElement(By.id("lname"));
        lName.click();
        lName.clear();
        Thread.sleep(6000);
        lName.sendKeys("yoda");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(6000);
        String textW3 = driver
                .findElement(By.cssSelector("div[class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']>p"))
                .getText();
        Thread.sleep(6000);
        System.out.println("Submitted Form Data " + textW3);
        System.out.println("================");
        Thread.sleep(6000);
        // actions.pause(Duration.ofSeconds(40)).perform();
        // driver.switchTo().frame("iframeResult");
        // actions.moveToElement(driver.findElement(By.id("fname"))).perform();
        // driver.findElement(By.id("fname")).click();
        // driver.findElement(By.id("fname")).clear();
        // actions.sendKeys("mo").perform();
        // actions.moveToElement(driver.findElement(By.id("lname"))).perform();
        // driver.findElement(By.id("lname")).click();
        // driver.findElement(By.id("lname")).clear();
        // actions.sendKeys("yoda").perform();
        // driver.findElement(By.xpath("//input[@type='submit']")).click();
        // actions.pause(Duration.ofSeconds(6)).perform();
        // String textW3 = driver.findElement(By.cssSelector("div[class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']>p")).getText();
        // actions.pause(Duration.ofSeconds(20)).perform();
        // System.out.println("Submitted Form Data " + textW3);
        // actions.pause(Duration.ofSeconds(9)).perform();
        ///////////////////////////
        // for (String windowHandle : driver.getWindowHandles()) {
        //     if (!originalWindow.contentEquals(windowHandle)) {
        //         driver.switchTo().window(windowHandle);
        //         break;
        //     }
        // }
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if (driver.getCurrentUrl().equals("https://www.guinnessworldrecords.com/account/register")) {
                Thread.sleep(6000);
                driver.findElement(By.id("LastName")).sendKeys("pikachu");
                driver.findElement(By.id("FirstName")).sendKeys("gifoof");
                driver.findElement(By.id("DateOfBirthDay")).sendKeys("10");
                driver.findElement(By.id("DateOfBirthMonth")).sendKeys("09");
                driver.findElement(By.id("DateOfBirthYear")).sendKeys("1992");
                Select region = new Select(driver.findElement(By.id("Country")));
                region.selectByVisibleText("Ukraine");
                Thread.sleep(1500);
                driver.findElement(By.id("State")).sendKeys("kharkiv");
                Thread.sleep(1500);
                driver.findElement(By.id("EmailAddress")).sendKeys("mailmail@mail.cim");
                driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("mailmail@mail.cim");
                driver.findElement(By.id("Password")).sendKeys("1234567");
                driver.findElement(By.id("ConfirmPassword")).sendKeys("1234568");
                Thread.sleep(2000);
                driver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
                String textPassword = driver.findElement(By.cssSelector("span[for='ConfirmPassword']")).getText();
                System.out.println("password check " + textPassword);
                System.out.println("================");
            } else if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/alertsdemo.html")) {
                Thread.sleep(6000);
                /*
                try {
                    driver.findElement(By.id("")).click();
                } catch (Exception e) {
                    System.out.println("No button \"accept-all\"");
                }
                */
                
                String resultAlert = "You selected alert popup";
                String resultConfirm = "You pressed Cancel in confirmation popup";
                String resultPrompt = "You entered text 'Final step of this task' in propmt popup";
                //ALERT_1
                driver.findElement(By.id("alertBox")).click();
                Thread.sleep(1000);
                Alert alert1 = driver.switchTo().alert();
                System.out.println("alert 1 popup: " + alert1.getText());
                alert1.accept();
                Thread.sleep(1000);
                String outputAlert1 = driver.findElement(By.id("output")).getText();
                System.out.println("outputAlert1: " + outputAlert1);
                boolean resultAlert1 = driver.findElement(By.id("output")).getText().equals(resultAlert);
                if(resultAlert1){
                    System.out.println("Test passed!");
                } else {
                    System.out.println("Test failed!");
                }
                System.out.println("================");
                // ALERT_2
                driver.findElement(By.id("confirmBox")).click();
                Thread.sleep(1000);
                Alert alert2 = driver.switchTo().alert();
                System.out.println("alert 2 popup: " + alert2.getText());
                alert2.dismiss();
                Thread.sleep(1000);
                String outputAlert2 = driver.findElement(By.id("output")).getText();
                System.out.println("outputAlert2: " + outputAlert2);
                boolean resultAlert2 = driver.findElement(By.id("output")).getText().equals(resultConfirm);
                if (resultAlert2) {
                    System.out.println("Test passed!");
                } else {
                    System.out.println("Test failed!");
                }
                System.out.println("================");
                // ALERT_3
                driver.findElement(By.id("promptBox")).click();
                Thread.sleep(1000);
                Alert alert3 = driver.switchTo().alert();
                System.out.println("alert 3 popup: " + alert3.getText());
                Thread.sleep(1000);
                alert3.sendKeys("'Final step of this task'");
                Thread.sleep(1000);
                alert3.accept();
                String outputAlert3 = driver.findElement(By.id("output")).getText();
                System.out.println("outputAlert3: " + outputAlert3);
                boolean resultAlert3 = driver.findElement(By.id("output")).getText().equals(resultPrompt);
                if (resultAlert3) {
                    System.out.println("Test passed!");
                } else {
                    System.out.println("Test failed!");
                }
                System.out.println("================");
            }
        }
        Thread.sleep(9000);
        driver.quit();
    }
}
