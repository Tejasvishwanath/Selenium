package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_05 {
	

	@Test
	public void TC_5() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://awesomeqa.com/webtable.html");
		
		String firstPart = "//table[@id='customers']/tbody/tr[";
		String secondPart = "]/td[";
		String lastPart = "]";
		
		int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
		
		for (int i=2;i<=row;i++)
		{
			for (int j=1;j<=column;j++)
			{
			String dynamicPath1 = firstPart + i + secondPart+ j+ lastPart;
			WebElement values = driver.findElement(By.xpath(dynamicPath1));
			System.out.println(values.getText()+ "|");
			}
			System.out.println();
		}
		
		Thread.sleep(2000) ;
		
		driver.quit();
		
		
	}
}
