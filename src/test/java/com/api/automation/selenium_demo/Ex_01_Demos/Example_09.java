package com.api.automation.selenium_demo.Ex_01_Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_09 {
	
	@Test
	 public void TC_08()

	 {
		EdgeOptions edge = new EdgeOptions();
		edge.addArguments("InPrivate");
		
		WebDriver driver = new EdgeDriver(edge);
		
		driver.navigate().to("https://app.vwo.com/#/login");
		
		WebElement userName= driver.findElement(By.id("login-username"));
		
		WebElement password = driver.findElement(By.id("login-password"));
		
		WebElement sign = driver.findElement(By.id("js-login-btn"));
		
		userName.sendKeys("Admin");
		password.sendKeys("pass");
		
		sign.click();
		
		WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
		
		WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));
		
		Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
		
		driver.quit();
		
	 }
}
