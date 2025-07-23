package com.api.automation.selenium_demo.Ex_01_Demos;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_15 {
	
	@Test
	public void Tc_15()
	{
		WebDriver driver = new EdgeDriver();			
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("http://hrm.sti.com/symfony/web/index.php/auth/login");
	    
		
		  try {  driver.findElement(By.id("loginBtn")).click();  } catch
		  (NoSuchElementException e) { 
		  System.out.println("Login button not found.");  }
		 	    
	    
	    
	    

	    try {
	        driver.findElement(By.id("loginBtn")).click();
	    } catch (StaleElementReferenceException e) {
	        System.out.println("Login button not found.");
	    }


	    
	    
	    
	    
	}

}
