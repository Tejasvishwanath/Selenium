package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_03 {
	
	
	@Test
	public void Tc_3() throws InterruptedException
	{
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("inPrivate");
		
		
		WebDriver driver = new EdgeDriver(option);
		
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		Thread.sleep(3000);
		
		WebElement makeAppoint = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
		
		makeAppoint.click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");
		
		WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("John Doe");
		
		WebElement passWord= driver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("ThisIsNotAPassword");
		
		WebElement login= driver.findElement(By.xpath("//button[@id='btn-login']"));
		login.click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
		
		driver.quit();
		

	}

}
