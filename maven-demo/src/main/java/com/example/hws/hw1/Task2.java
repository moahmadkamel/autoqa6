package com.example.hws.hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.driverFactory.DriverSetUp;

public class Task2 {
    /*
     * Write a method whose parameters accept two WebElements.
     * the method displays information to the console which of the two elements is
     * located higher on the page,
     * which element is located to the left on the page,
     * and also which of the elements occupies the largest area.
     * Method parameters can also include other arguments if necessary.
     */

    public static void getInfo(WebElement element1, WebElement element2) {

        if (element1.getLocation().y < element2.getLocation().y) {
            System.out.println("Search Button is located higher on the page");
        } else if (element1.getLocation().y > element2.getLocation().y) {
            System.out.println("Search Link is located higher on the page");
        } else {
            System.out.println("Elements are on same level");
        }

        if (element1.getLocation().x < element2.getLocation().x) {
            System.out.println("Search Button is located to the left on the page");
        } else if (element1.getLocation().x > element2.getLocation().x) {
            System.out.println("Search Link is located to the left on the page");
        } else {
            System.out.println("Elements are on same level");
        }

        if (element1.getSize().width * element1.getSize().height > element2.getSize().width
                * element2.getSize().height) {
            System.out.println("Search Button has the largest area");
        } else if (element1.getSize().width * element1.getSize().height < element2.getSize().width
                * element2.getSize().height) {
            System.out.println("Search Link has the largest area");
        } else {
            System.out.println("Elements are the same");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/search");

        WebElement searchButton = driver.findElement(By.id("search-button"));

        WebElement searchLink = driver.findElement(By.id("search"));

        System.out.println("Size of search button " + searchButton.getSize());
        System.out.println("Size of search link " + searchLink.getSize());

        System.out.println("Button width " + searchButton.getSize().width);
        System.out.println("Button height " + searchButton.getSize().height);
        System.out.println("Search width " + searchLink.getSize().width);
        System.out.println("Search height " + searchLink.getSize().height);

        System.out.println(
                "searchButton width * height = " + searchButton.getSize().width * searchButton.getSize().height);
        System.out.println("searchLink width * height = " + searchLink.getSize().width * searchLink.getSize().height);

        System.out.println("Coordinate x of search Button " + searchButton.getLocation().x);
        System.out.println("Coordinate y of search Button " + searchButton.getLocation().y);
        System.out.println("Coordinate x of search Link " + searchLink.getLocation().x);
        System.out.println("Coordinate y of search Link " + searchLink.getLocation().y);

        getInfo(searchButton, searchLink);

        driver.quit();

    }
}
