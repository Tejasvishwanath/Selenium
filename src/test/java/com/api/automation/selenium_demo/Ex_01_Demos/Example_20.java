package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_20 {
	
	
	@Test
	public void TC_20() {
		
		WebDriver driver  = new EdgeDriver();
		
		driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		
		search.sendKeys("United States");
		
		
		
		
		
		
	}

}
