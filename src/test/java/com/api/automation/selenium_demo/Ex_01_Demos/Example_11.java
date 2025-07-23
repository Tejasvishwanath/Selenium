package com.api.automation.selenium_demo.Ex_01_Demos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example_11 {
	
	
	@Test
	public void TC_11()
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		
		WebElement popUp = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(popUp));
		
		popUp.click();
		
		Actions action = new Actions(driver);
		
		WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
		
		
		action.moveToElement(fromCity).click();
		fromCity.sendKeys("IXC");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> city = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for (WebElement cities : city)
		{
              if (cities.getText().contains("Chandigarh"))
              {
            	  cities.click();
            	  break;
              }
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	
	}

}
