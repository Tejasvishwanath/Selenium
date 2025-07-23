package com.api.automation.selenium_demo.Ex_01_Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_06 {
	
	@Test
	public void TC_6()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://awesomeqa.com/webtable1.html");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
		
		for (WebElement rows: row)
		{
			List<WebElement> cell = rows.findElements(By.tagName("td"));
			for (WebElement cells : cell)
			{
				System.out.println(cells.getText());
			}
		}
		
		driver.quit();
	}
	

}
