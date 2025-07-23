package com.api.automation.selenium_demo.Ex_01_Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_08 {
	
	
	@Test
	public void TC_7() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amcharts.com/svg-maps/?map=india");
		
		WebElement  place = driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path'][2]"));
		
		Thread.sleep(2000);
		
		
		place.click();
		
		//driver.quit();
		
		
		
		
		
	}

}
