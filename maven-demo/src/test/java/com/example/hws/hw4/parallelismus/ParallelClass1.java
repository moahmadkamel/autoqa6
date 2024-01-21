package com.example.hws.hw4.parallelismus;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClass1 {
    
    @Test
    public void parallel1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 1");
        assertTrue(true);
    }

    @Test
    public void parallel2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 2");
        assertTrue(true);
    }

    @Test
    public void parallel3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 3");
        assertTrue(true);
    }

    @Test
    public void parallel4() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 4");
        assertTrue(true);
    }

    @Test
    public void parallel5() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testMethod 5");
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
