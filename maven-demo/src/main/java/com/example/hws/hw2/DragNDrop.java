package com.example.hws.hw2;

// import java.time.Duration;

import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.example.driverFactory.DriverSetUp;

public class DragNDrop {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://ashortjourney.com/");

        Thread.sleep(25000);
        Actions actions = new Actions(driver);
        
        System.out.println(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")).getSize());
        // .moveByOffset(80,80)
        System.out.println(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]")).getSize());
        // .moveByOffset(16,16)

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")))
                .clickAndHold()
                // .pause(Duration.ofSeconds(5))
                .moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]")))
                // .pause(Duration.ofSeconds(5))
                .moveByOffset(0, 16)
                .release()
                .build().perform();
        Thread.sleep(20000);        
             
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")))
                .clickAndHold()
                // .pause(Duration.ofSeconds(5))
                .moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]")))
                // .pause(Duration.ofSeconds(5))
                .moveByOffset(16, 0)
                .release()
                .build().perform();
        Thread.sleep(20000);
        
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")))
                .clickAndHold()
                // .pause(Duration.ofSeconds(5))
                .moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]")))
                // .pause(Duration.ofSeconds(5))
                .moveByOffset(16, 0)
                .release()
                .build().perform();
        Thread.sleep(20000);

        actions.dragAndDrop(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")),
                driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]"))).perform();
        Thread.sleep(20000);
        
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")))
                .clickAndHold()
                // .pause(Duration.ofSeconds(5))
                .moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]")))
                // .pause(Duration.ofSeconds(5))
                .moveByOffset(0, 16)
                .release()
                .build().perform();
        Thread.sleep(20000);
        
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")))
                .clickAndHold()
                // .pause(Duration.ofSeconds(5))
                .moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]")))
                // .pause(Duration.ofSeconds(5))
                .moveByOffset(16, 0)
                .release()
                .build().perform();
        Thread.sleep(20000);

        actions.dragAndDrop(driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][3]")),
                driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle'][1]"))).perform();
        Thread.sleep(10000);
        
        actions.click(driver.findElement(By.tagName("textarea")))
                // .pause(Duration.ofSeconds(5))
                .sendKeys("Done!")
                // .pause(Duration.ofSeconds(5))
                .build().perform();

        Thread.sleep(9000);  
    
        driver.quit();
    }
}
