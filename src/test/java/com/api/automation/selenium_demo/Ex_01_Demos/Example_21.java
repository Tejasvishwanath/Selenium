package com.api.automation.selenium_demo.Ex_01_Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_21 {

	@Test (dataProvider="getData")
	public void TC_21(String users, String password)
	{
	      WebDriver driver =  new EdgeDriver();
		
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		   
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		  WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@name='username']")));  
		  WebElement passWord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@name='password']"))); 
		  WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[@type='submit']"))); 
		  userName.sendKeys(users); 
		  passWord.sendKeys(password); 
		 
		  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  login.click(); 
		 		
		
		
	    System.out.println(users + "----"+ password );
	
	
	}
	
	@DataProvider
	public Object[][] getData()
	{ 
		
		return  UtilExcel.getDataFromExcel("sheet1");
			
	}
		
		
		
	
}
