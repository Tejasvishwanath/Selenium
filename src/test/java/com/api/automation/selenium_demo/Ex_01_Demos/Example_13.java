package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_13 {
	
	@Test
	public void TC_13()
	{
WebDriver driver = new EdgeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://awesomeqa.com/selenium/upload.html");
		
		WebElement files = driver.findElement(By.xpath("//input[@id='fileToUpload']"));
		
		String path = System.getProperty("user.dir");
		String fullPath = path+ "\\src\\test\\java\\com\\api\\automation\\selenium_demo\\Ex_01_Demos\\Data.txt";
		
		files.sendKeys(fullPath);
		
		WebElement upload = driver.findElement(By.xpath("//input[@type='submit']"));
		
		upload.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
		driver.quit();
	}

}
