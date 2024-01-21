package com.example.hws.hw4.grouping;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Groups extends BaseTest {
    
    @Test(priority = 1, groups = { "firstGroup" })
    public void one() {
        System.out.println("testMethod one");
        assertTrue(true);
    }

    @Test(priority = 5, groups = { "secondGroup" })
    public void two() {
        System.out.println("testMethod two");
        assertTrue(true);
    }

    @Test(priority = 2, groups = { "firstGroup" })
    public void three() {
        System.out.println("testMethod three");
        assertTrue(true);
    }

    @Test(priority = 6, groups = { "secondGroup" })
    public void four() {
        System.out.println("testMethod four");
        assertTrue(true);
    }

    @Test(priority = 3, groups = { "firstGroup" })
    public void five() {
        System.out.println("testMethod five");
        assertTrue(true);
    }

    @Test(priority = 7, groups = { "secondGroup" })
    public void six() {
        System.out.println("testMethod six");
        assertTrue(true);
    }

    @Test(priority = 4, groups = { "firstGroup" })
    public void seven() {
        System.out.println("testMethod seven");
        assertTrue(true);
    }

    @Test(priority = 8, groups = { "secondGroup" })
    public void eight() {
        System.out.println("testMethod eight");
        assertTrue(true);
    }

}
