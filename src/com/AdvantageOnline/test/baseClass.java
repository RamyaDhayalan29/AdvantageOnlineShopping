package com.AdvantageOnline.test;

import com.AdvantageOnline.businessLib.AdvantageOnline;
import com.AdvantageOnline.commonLib.ExcelLib;

public class baseClass {
	AdvantageOnline AdvantageOnline = new AdvantageOnline();
	ExcelLib eLib = new ExcelLib();
	
	
	public void AdvantageOnlineShopping()
	{
		try {
			String AppPath = eLib.getExcelData("Sheet1", 1, 0);
			String User = eLib.getExcelData("Sheet1", 1, 1);
			
			int i=(int) (Math.random()*100);  
			String s=String.valueOf(i);
			String Uname = User + s;
			
			System.out.println(i+""+Uname);
			String Email = eLib.getExcelData("Sheet1", 1, 2);
			String Password = eLib.getExcelData("Sheet1", 1, 3);
			String product = eLib.getExcelData("Sheet1", 1, 4);
			/*String CardNumber = eLib.getExcelData("Sheet1", 1, 5);
			String CVV = eLib.getExcelData("Sheet1", 1, 6);
			String MM = eLib.getExcelData("Sheet1", 1,7);
			String YYYY = eLib.getExcelData("Sheet1", 1, 8);
			String Cardholder_Name = eLib.getExcelData("Sheet1", 1, 9);*/
			AdvantageOnline.driverInit(AppPath);
			AdvantageOnline.createAccount(Uname, Email,Password);
			System.out.println("Successfully navigated to Advantage Online home page");
			AdvantageOnline.AddtoCart(product);	
			//AdvantageOnline.Payment(CardNumber, CVV, MM, YYYY, Cardholder_Name);
			AdvantageOnline.Payment(Uname,Password);	
		} catch (Exception e) {
			
			System.out.println("Failed to navigated to Advantage Online home page");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	 public void logoutSCSR()
	 {
		 try
		 {
			 // AdvantageOnline.logout();
				System.out.println("Logout Successfull");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 System.out.println("Failed to quit browser");
			 
		 }
	 }

}
