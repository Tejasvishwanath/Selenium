package com.api.automation.selenium_demo.Ex_01_Demos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_10 {
	
	@Test
	public void TC_10() throws InterruptedException

	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
		
		  Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement pizzaInput = (WebElement) js.executeScript
			("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");");
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.visibilityOf(pizzaInput));
		
		
		pizzaInput.sendKeys("Pizzassssss");
		
 }
			
}
