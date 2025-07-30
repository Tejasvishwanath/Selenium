package com.api.automation.selenium_demo.Ex_01_Demos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example_25 {
	
	
	@Test
	 public void TC_25()
	 {
		 EdgeOptions edged = new EdgeOptions();
	        edged.addArguments("--start-maximized");
	        edged.addArguments("--guest");
	        WebDriver driver = new EdgeDriver(edged);
            
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        driver.get("https://selectorshub.com/xpath-practice-page/");
	        
	        int row= driver.findElements(By.xpath("//td[contains(text(),'ESS')]/preceding-sibling::td[2]")).size();
	        
	        String a = "(//td[contains(text(),'ESS')]/preceding-sibling::td[2])[";
	        String b = "]";
	        
	        for (int i =1 ; i<=row;i++)
	        
	        {
	        	String c = a+ i +b;
	        	System.out.println(c);
	        	
	        	WebElement cell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(c)));
	        	
	        	Actions actions = new Actions(driver);
	        	actions.moveToElement(cell).click().perform();
	        	// Adding
	        	
	        	
	        }
	        
	        
	        
//	        List<WebElement> checkbox = driver.findElements(By.xpath("//td[contains(text(),'ESS')]/preceding-sibling::td[2]"));
//	        
//	        for (WebElement s : checkbox)
//	        {
//	        	System.out.println(s.getText());
//	        	//Actions action =  new Actions(driver);
//	        	s.click();
//	        	
//	        }
	 }

}
