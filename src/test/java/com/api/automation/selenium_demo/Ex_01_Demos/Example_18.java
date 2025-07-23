package com.api.automation.selenium_demo.Ex_01_Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example_18 {

	@Test
	public void Test_18() {
		
		Double n =0.00;
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement textField = driver.findElement(By.className("Pke_EE"));
		textField.sendKeys("Laptop");

		WebElement searchButton = driver.findElement(By.className("_2iLD__"));

		searchButton.click();

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// List<WebElement> tableList =
		// driver.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']/div"));
		String first = "//div[@class='DOjaWF gdgoEp']/div[";
		String last = "]";

		int row = driver.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']/div")).size();
	//	List<WebElement> tableDetails;

		String sFirst = "/div/div/div/a[3]//div[@class='Nx9bqj'])[";
		String sSecond = "]";
		int sRow = driver
				.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']/div[2]/div/div/div/a[3]//div[@class='Nx9bqj']"))
				.size();

		int count = 0;

		for (int i = 2; i <= row - 2; i++) {

			String idivisualList = first + i + last;
			// System.out.println(idivisualList);

			for (int j = 1; j <= sRow; j++) {
				String priceListing = sFirst + j + sSecond;
				// System.out.println("("+idivisualList+priceListing);
				String pricePath = "(" + idivisualList + priceListing;
				List<WebElement> priceOfProduct = driver.findElements(By.xpath(pricePath));

				for (WebElement priceList : priceOfProduct) {
					count++;
					// System.out.println(priceList.getText());
					String cost = priceList.getText();
					cost = cost.replace("₹", "").replace(",", "").trim();
					Double printcost = Double.parseDouble(cost);
					
					System.out.println("The cost of this Product is :" +printcost);
					
					n=n+printcost;
				}

			}
		}
		System.out.println("Total Products in the screen :" + count);
		System.out.println(n);
	}
	
}
