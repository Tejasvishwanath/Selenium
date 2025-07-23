package com.api.automation.selenium_demo.Ex_01_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Example_02 {
	
	@Test
	public void Tc_2() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://app.vwo.com/#/login");
		
		//<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
		
		WebElement emailId = driver.findElement(By.id ("login-username"));
		
		emailId.sendKeys("admin@admin.com");
		
		//<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
		
		WebElement passwordField = driver.findElement(By.id("login-password"));
		
		passwordField.sendKeys("1254658");
		
		//<button type="submit" id="js-login-btn" class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
		//<span class="icon loader hidden" data-qa="zuyezasugu"></span>
		//<span data-qa="ezazsuguuy">Sign in</span>
	//</button>
		
		WebElement submitButton = driver.findElement(By.id("js-login-btn"));
		submitButton.click();
		
		Thread.sleep(3000);
		
		//<div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
		
		WebElement errorMsg = driver.findElement(By.className("notification-box-description"));
		
		System.out.println(errorMsg.getText());
		
		
		Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
		
		driver.quit();
		
		
	}

}
