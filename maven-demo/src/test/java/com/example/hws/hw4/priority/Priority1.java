package com.example.hws.hw4.priority;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Priority1 extends BaseTest {
    
    @Test(priority = 7)
    public void a() {
        System.out.println("testMethod a");
        assertTrue(true);
    }
    
    @Test(priority = 6)
    public void b() {
        System.out.println("testMethod b");
        assertTrue(true);
    }
    
    @Test(priority = 5)
    public void c() {
        System.out.println("testMethod c");
        assertTrue(true);
    }
    
    @Test(priority = 4)
    public void d() {
        System.out.println("testMethod d");
        assertTrue(true);
    }
    
    @Test(priority = 3)
    public void e() {
        System.out.println("testMethod e");
        assertTrue(true);
    }
    
    @Test(priority = 2)
    public void f() {
        System.out.println("testMethod f");
        assertTrue(true);
    }
    
    @Test(priority = 1)
    public void g() {
        System.out.println("testMethod g");
        assertTrue(true);
    }
    

    /*
    @Test(dependsOnMethods = { "b" })
    public void a() {
        System.out.println("testMethod a");
        assertTrue(true);
    }

    @Test(dependsOnMethods = { "c" })
    public void b() {
        System.out.println("testMethod b");
        assertTrue(true);
    }

    @Test(dependsOnMethods = { "d" })
    public void c() {
        System.out.println("testMethod c");
        assertTrue(true);
    }

    @Test(dependsOnMethods = { "e" })
    public void d() {
        System.out.println("testMethod d");
        assertTrue(true);
    }

    @Test(dependsOnMethods = { "f" })
    public void e() {
        System.out.println("testMethod e");
        assertTrue(true);
    }

    @Test(dependsOnMethods = { "g" })
    public void f() {
        System.out.println("testMethod f");
        assertTrue(true);
    }

    @Test
    public void g() {
        System.out.println("testMethod g");
        assertTrue(true);
    }
    */
}
