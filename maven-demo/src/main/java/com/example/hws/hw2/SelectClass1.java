package com.example.hws.hw2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.example.driverFactory.DriverSetUp;
// import qa6.lesson5.TaskForLesson5;

public class SelectClass1 {
    /*
     1) http://only-testing-blog.blogspot.com/2014/01/textbox.html?
     Write a program that implements the action shown in “video1.mp4”.
     After executing the program, the console should display information in the
     following form:
     
     Cars available for selection:
     Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
     
     Countries from the first table:
     USA, Russia, Japan, Mexico, India, Malaysia, Greece.
     
     Countries from the second table:
     France, Germany, Italy, Spain.
    */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        Thread.sleep(2000);

        WebElement carsWebElement = driver.findElement(By.id("Carlist"));
    
        Select cars = new Select(carsWebElement);

        List<WebElement> carsList = cars.getOptions();
        System.out.println("Cars available for selection: ");
        for (WebElement singleElement : carsList) {
            System.out.println(singleElement.getText());
        }

        //select
        cars.selectByVisibleText("Renault");
        // cars.selectByValue("Renault Car");
        // Thread.sleep(2000);
        // cars.selectByIndex(5);
        Thread.sleep(2000);
        System.out.println("===========================");

        Select countries = new Select(driver.findElement(By.name("FromLB")));
        System.out.println("Countries from the first table: ");
        List<WebElement> countriesList = countries.getOptions();
        for (WebElement singleElement : countriesList) {
            System.out.println(singleElement.getText());

        }
        countries.selectByVisibleText("   France   ");
        Thread.sleep(2000);
        countries.selectByVisibleText("India");
        Thread.sleep(2000);
        countries.deselectByVisibleText("India");
        Thread.sleep(2000);
        countries.selectByVisibleText("Germany");
        Thread.sleep(2000);
        countries.selectByVisibleText("Italy");
        Thread.sleep(2000);
        countries.selectByVisibleText("Malaysia");
        Thread.sleep(2000);
        countries.deselectByVisibleText("Malaysia");
        Thread.sleep(2000);
        countries.selectByVisibleText("Spain");
        Thread.sleep(2000);

        // System.out.println("===========================");
        // System.out.println("Countries from the second table: ");
        // List<WebElement> selectedCountries = countries.getAllSelectedOptions();
        // for (WebElement singleElement : selectedCountries) {
        //     System.out.println(singleElement.getText());
        // }
        System.out.println("===========================");

        // driver.findElement(By.xpath("//input[@value='->']")).click();
        driver.findElement(By.cssSelector("[value='->']")).click();

        Select countriesTable2 = new Select(driver.findElement(By.name("ToLB")));
        System.out.println("Countries from the second table: ");
        List<WebElement> countriesList2 = countriesTable2.getOptions();
        for (WebElement singleElement : countriesList2) {
            System.out.println(singleElement.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
