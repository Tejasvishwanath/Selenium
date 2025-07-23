package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_19 {

	@Test
	public void TC_19() {
		WebDriver driver = new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.flipkart.com/'");
	}

}
