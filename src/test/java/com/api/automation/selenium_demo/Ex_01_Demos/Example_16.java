package com.api.automation.selenium_demo.Ex_01_Demos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Example_16 {
	
	@Test
	public void TC_16()
	{
		WebDriver driver = new EdgeDriver();			
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://the-internet.herokuapp.com/windows");
	    
	    String parent =  driver.getWindowHandle();
	    
	    System.out.println(parent);
	    
	    WebElement newWindow = driver.findElement(By.xpath("//a[@href='/windows/new']"));
	    
	    newWindow.click();
	    
	    String tes =driver.getWindowHandle();
	    
	    System.out.println(tes);
	    
	    
	    Set <String> windows = driver.getWindowHandles();
	    
	    System.out.println(windows);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //Switch back to parent 
	    driver.switchTo().window(parent);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // Switch back to child
	    for (String handle : windows)
	    {
	    	driver.switchTo().window(handle);
	    	if (driver.getPageSource().contains("New Window"))
	    	{
	    		System.out.println("Test Pass");
	    	}
	    }
	    

	}

}
