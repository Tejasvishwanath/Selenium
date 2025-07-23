package com.api.automation.selenium_demo.Ex_01_Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example_07 {
	
	@Test
	public void TC_7() 
	{
		WebDriver driver =  new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchBox.sendKeys("Toys");
		
		
		
		WebElement svgSearch = driver.findElement(By.xpath("//*[local-name()='svg'][1]"));
		svgSearch.click();
		
		driver.quit();
	}

}
