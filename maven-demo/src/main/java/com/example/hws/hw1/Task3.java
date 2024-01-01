package com.example.hws.hw1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.driverFactory.DriverSetUp;

public class Task3 {
    /*
    Write a method that displays a message about the element ID,
    element tag value, element class value,
    the value of the name attribute of the element, the text of this element,
    as well as the coordinates of the center of the container of this element.
    */

    public static int getCentreX(WebElement element) {
        return element.getLocation().x + element.getSize().width / 2;
    }

    public static int getCentreY(WebElement element) {
        return element.getLocation().y + element.getSize().height / 2;
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/search");

        Thread.sleep(4000);

        WebElement searchButton = driver.findElement(By.id("search-button"));

        System.out.println(searchButton.getText());
        System.out.println(searchButton.getTagName());
        System.out.println(searchButton.getAttribute("class"));
        System.out.println(searchButton.getAttribute("id"));

        System.out.println("Button width " + searchButton.getSize().width);
        System.out.println("Button height " + searchButton.getSize().height);

        System.out.println("Coordinates of element " + searchButton.getLocation());

        System.out.println("Coordinate x of element" + searchButton.getLocation().x);
        System.out.println("Coordinate y of element" + searchButton.getLocation().y);

        System.out.println("Size of search button " + searchButton.getSize());

        System.out.println(getCentreX(searchButton));
        System.out.println(getCentreY(searchButton));
        
        driver.quit();
    }
}

