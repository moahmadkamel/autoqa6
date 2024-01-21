package com.example.hws.hw4.priority;

//import com.example.driverFactory.DriverSetUp;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
//import com.example.utils.ActionsClass;

public class BaseTest {

    //@BeforeClass
    @BeforeSuite
    public void precondition(){
        System.out.println("Class was started@!");
    }

    //@AfterClass
    @AfterSuite
    public void postConditions(){
        System.out.println("Class ended");
    }

}
