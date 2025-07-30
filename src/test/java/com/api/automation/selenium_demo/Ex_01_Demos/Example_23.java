package com.api.automation.selenium_demo.Ex_01_Demos;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Example_23 {
	
	@Test
	
	public void Tc_23()
	{
		EdgeOptions edged = new EdgeOptions ();
		edged.addArguments("--start-maximized");
		edged.addArguments("--guest");
		WebDriver driver = new EdgeDriver(edged);
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		List<WebElement> values = null;
		
		int row = driver.findElements(By.xpath("//div[@id='tableWrapper']/table/tbody/tr")).size();
		 String first = "//div[@id='tableWrapper']/table/tbody/tr[";
		 String second = "]";
		 
		 String path1 ="";
		
		int col = driver.findElements(By.xpath("//div[@id='tableWrapper']/table/tbody/tr[1]/td")).size();
		String sfirst = "/td[";
		String ssecond ="]";
		
		
		for (int i=1; i<=row ; i++)
		{
			 path1 = first + i + second;
			
			for (int j=1 ; j<=col ; j++)
			{
				String path2 = path1 + sfirst + j+ ssecond;
				values = driver.findElements(By.xpath(path2));
				
				for (WebElement s : values)
				{
					System.out.println(s.getText());
					if (s.getText().contains("ESS"))
					{
						int targetCol = j - 2;
						if (targetCol >=1)
						{
							String path3 = path1 + sfirst + targetCol + ssecond;
							driver.findElement(By.xpath(path3)).click();
						}
						
					}
				}
			}
			
			

		}
		
		
		
	}

}
