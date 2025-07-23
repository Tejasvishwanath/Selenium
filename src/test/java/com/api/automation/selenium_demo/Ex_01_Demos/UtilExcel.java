package com.api.automation.selenium_demo.Ex_01_Demos;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilExcel {
	
	
	static Workbook book;	
	static Sheet sheet;
	
	public static String Sheet_Path = System.getProperty("user.dir")+ "\\src\\test\\resources\\employees.xlsx";
	
	public static Object [][] getDataFromExcel(String sheetName)
	{
		
		try {
			FileInputStream fileInput =  new FileInputStream (Sheet_Path);
			book = WorkbookFactory.create(fileInput);
			sheet = book.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File opening or issue with file");;
		}
		
		
		Object [][] data = new Object [sheet.getLastRowNum()]  [sheet.getRow(0).getLastCellNum()];
		
		for (int i=0; i< sheet.getLastRowNum() ; i++)
		{
			for (int j=0; j< sheet.getRow(0).getLastCellNum(); j++)
			{
				data [i][j] = sheet.getRow(i+1).getCell(j).toString();
				
			}
		}
		
		try {
			book.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	fileInput.close();
	// Committing the code to git hub 
		return data;
	}

}
