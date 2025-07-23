package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Example_01 {
	
	@Test
	public void Tc1()
	{
		//options to customise the browser 
		EdgeOptions option = new EdgeOptions();
		option.addArguments("inPrivate");
		
		//creates a object and session id will be created 
		WebDriver driver = new EdgeDriver(option);
		
		// option.addArguments("window size=1100,300");
		
		
		driver.get("http://hrm.sti.com");
		
		
		
		
		// driver.quit();
		
		
	}
	

}
