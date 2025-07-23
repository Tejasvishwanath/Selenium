package com.api.automation.selenium_demo.Ex_01_Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_14 {
	
	@Test
	public void TC_14()
	{
		WebDriver driver = new EdgeDriver();			
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://demo.applitools.com/app.html");
	    
	    int row = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr")).size();
	   // int column = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr/td")).size();
	    
	    double total= 0.0;
	    
	    for (int i =1;i<=row;i++)
	    {
	    	WebElement tableValues = driver.findElement(By.xpath("//table[@class='table table-padded']/tbody/tr["+i+"]/td[5]"));
	    	// System.out.println(tableValues);
            String valueText = tableValues.getText().trim();
            
            char sign = valueText.charAt(0);
	    	
            String numberStr = valueText.replaceAll("[^\\d.,]", "").replace(",", "");
            Double amount = Double.parseDouble(numberStr);
            
            if (sign =='+')
            {
            	total +=amount;
            }
            else if (sign == '-')
            {
            	total -=amount;
            }
            
            System.out.println("Row " + i + " Value: " + sign + amount);
    	
	    }
	    
        System.out.println("Net Total = " + total);
        
        
        driver.quit();
	
	}

}
