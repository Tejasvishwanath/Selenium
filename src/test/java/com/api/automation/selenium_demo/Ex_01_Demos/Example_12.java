package com.api.automation.selenium_demo.Ex_01_Demos;

public class Example_12 {
	
	public static void main (String[] args)
	{
		String s = "7500";
		int a = Integer.parseInt(s); 
		
		System.out.println(a);
		
		int b = Integer.valueOf("9000");
		
		System.out.println(b);
		
		int c = 7500;
		String z = String.valueOf(c);
		
		System.out.println(z);
		
		String work1 = System.getProperty("user.dir");
		System.out.println(work1);
		
	}

	
	
}
