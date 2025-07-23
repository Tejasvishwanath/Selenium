package com.api.automation.selenium_demo.Ex_01_Demos;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Example_04 {
	
	@Test
	public void TC_4()
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://awesomeqa.com/webtable1.html");
		
		int rows = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr")).size();
		int column = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr[1]/td")).size();

		
		String firstPart= "//table[@summary='Sample Table']/tbody/tr[";
		String secondPart="]/td[";
		String lastPart= "]";
		
		
		
		
		System.out.println(rows);
		System.out.println(column);
		
		for (int i=1;i<=rows;i++)
		{
			for (int j=1;j<=column;j++)
			{
			String dynamicPath = firstPart+i+secondPart+j+lastPart;
			WebElement value = driver.findElement(By.xpath(dynamicPath));
			System.out.println(value.getText());
			}
		}
		
				
		driver.quit();
	}

}
