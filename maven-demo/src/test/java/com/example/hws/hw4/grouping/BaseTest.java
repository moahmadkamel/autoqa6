package com.example.hws.hw4.grouping;

//import com.example.driverFactory.DriverSetUp;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
//import com.example.utils.ActionsClass;

public class BaseTest {

    @BeforeClass(groups = { "firstGroup", "secondGroup" })
    //@BeforeSuite
    public void precondition(){
        System.out.println("Class was started@!");
    }

    @AfterClass(groups = { "firstGroup", "secondGroup" })
    //@AfterSuite
    public void postConditions(){
        System.out.println("Class ended");
    }

}
