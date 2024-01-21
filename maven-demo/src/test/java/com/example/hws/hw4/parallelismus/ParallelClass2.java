package com.example.hws.hw4.parallelismus;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClass2 {
    @Test
    public void parallel6() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 6");
        assertTrue(true);
    }

    @Test
    public void parallel7() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 7");
        assertTrue(true);
    }

    @Test
    public void parallel8() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 8");
        assertTrue(true);
    }

    @Test
    public void parallel9() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 9");
        assertTrue(true);
    }

    @Test
    public void parallel10() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 10");
        assertTrue(true);
    }

    @BeforeClass
    public void precondition(){
        System.out.println("Class was started@!");
    }

    @AfterClass
    public void postConditions(){
        System.out.println("Class ended");
    }

}
