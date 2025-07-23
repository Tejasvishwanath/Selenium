package com.api.automation.selenium_demo.Ex_01_Demos;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example_17 {
	
	@Test
	public void TC_12()
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://app.vwo.com/#/test/ab/13/heatmaps?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1&accountId=666400");
		
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		List<WebElement> video = driver.findElements(By.xpath("//li[@id='js-heatmap-thumbnail']"));
		
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(25));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(video));
		
		Actions action = new Actions(driver);
				
		action.moveToElement(video.get(1)).click().build().perform();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set <String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		
		for (String handle : windowHandles)
		{
			if (!handle.equals(parent))
			{
				driver.switchTo().window(handle);
				WebElement iframeElement = driver.findElement(By.xpath("//div[@id='clickmap-image']/following-sibling::iframe[1]"));
				driver.switchTo().frame(iframeElement);
				WebElement clickMap = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-qa='liqokuxuba']")));
				clickMap.click();
	
			}
		
		}
		
		 driver.quit();

	}

}
