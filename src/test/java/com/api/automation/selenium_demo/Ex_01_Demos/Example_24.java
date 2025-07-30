package com.api.automation.selenium_demo.Ex_01_Demos;


	

	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;

	public class Example_24 {

	    @Test
	    public void Tc_23() {
	        EdgeOptions edged = new EdgeOptions();
	        edged.addArguments("--start-maximized");
	        edged.addArguments("--guest");
	        WebDriver driver = new EdgeDriver(edged);

	        driver.get("https://selectorshub.com/xpath-practice-page/");

	        int rowCount = driver.findElements(By.xpath("//div[@id='tableWrapper']/table/tbody/tr")).size();
	        int colCount = driver.findElements(By.xpath("//div[@id='tableWrapper']/table/tbody/tr[1]/td")).size();

	        for (int i = 1; i <= rowCount; i++) {
	            String rowXPath = "//div[@id='tableWrapper']/table/tbody/tr[" + i + "]";

	            for (int j = 1; j <= colCount; j++) {
	                String cellXPath = rowXPath + "/td[" + j + "]";
	                WebElement cell = driver.findElement(By.xpath(cellXPath));
	                String text = cell.getText();
	                System.out.println(text);

//	                if (text.contains("ESS")) {
//	                    int targetCol = j - 2;
//	                    if (targetCol >= 1) {
//	                        String targetCellXPath = rowXPath + "/td[" + targetCol +"]" ;
//	                        WebElement targetCell = driver.findElement(By.xpath(targetCellXPath));
//	                        targetCell.click();
//	                        System.out.println("Clicked on: " + targetCellXPath);
//	                    }
//	                }
	            }
	        }

	        driver.quit();  // Always close the browser
	    }
	}



