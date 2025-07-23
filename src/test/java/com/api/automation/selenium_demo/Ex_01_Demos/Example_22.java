package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_22 {
	
	@Test
	public void TC_22()
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.us.espocrm.com/?l=en_US#");
	}

}
