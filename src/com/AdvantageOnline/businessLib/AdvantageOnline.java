package com.AdvantageOnline.businessLib;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.AdvantageOnline.commonLib.Driver;
import com.AdvantageOnline.commonLib.ExcelLib;
import com.AdvantageOnline.commonLib.ReportLib;
import com.AdvantageOnline.commonLib.WebDriverLib;
import com.AdvantageOnline.pageLib.CreateAccount;
import com.AdvantageOnline.pageLib.HomePage;
import com.AdvantageOnline.pageLib.PaymentGateway;
import com.AdvantageOnline.pageLib.ShoppingCartPage;
import com.AdvantageOnline.pageLib.orderPayment;

public class AdvantageOnline {
	
	//WebDriver driver = Driver.fireFoxDriver();
	//WebDriver driver = Driver.configureDriver();
	WebDriver driver = Driver.chromeDriver();
	
	WebDriverLib wLib = new WebDriverLib();
	ExcelLib eLib = new ExcelLib();
	ReportLib reportLib = new ReportLib();
	
	CreateAccount creAcc = PageFactory.initElements(driver, CreateAccount.class);
	HomePage homepg = PageFactory.initElements(driver, HomePage.class);
	orderPayment orderpg = PageFactory.initElements(driver, orderPayment.class);
	PaymentGateway PaymentGatepg = PageFactory.initElements(driver , PaymentGateway.class);
	ShoppingCartPage ShoppingCartPg = PageFactory.initElements(driver , ShoppingCartPage.class);
	
	/*  Navigate to URL http://www.AdvantageOnline.com
	 	Wait for page to Load
	 	Maximize the browser window	*/
	
	public void driverInit(String path)
	  {
		  driver.navigate().to(path);
		  wLib.waitForPageToLoad();
		  driver.manage().window().maximize();
	  }
	
	
	
	/* 	Create Account */
	 
	public void createAccount(String Uname,String Email,String Password) throws IOException
	{
		try
		{
			creAcc.getMenuUserLink().click();
			
			wLib.waitForPageToLoad();
			
			WebElement element = creAcc.getCreateNewAccount();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
				
			creAcc.getusernameRegisterPage().sendKeys(Uname);
			creAcc.getemailRegisterPage().sendKeys(Email);
			creAcc.getpasswordRegisterPage().sendKeys(Password);
			creAcc.getconfirm_passwordRegisterPage().sendKeys(Password);
			//creAcc.getallowOffersPromotion().click();
			creAcc.geti_agree().click();
			creAcc.getregister_btnundefined().click();
		
			wLib.waitForPageToLoad();
						
			System.out.println("Account created successfully");
		}
		catch(Exception e){
			e.printStackTrace();
			reportLib.getScreenshot();
			System.out.println("Account created Unsuccessfull");
		}
	}
	
	
	public void AddtoCart(String product) throws IOException
	{
		try
		{
			/*homepg.getmenuSearch().click();
			
			homepg.getautoComplete().sendKeys(product);
			
			driver.findElement(By.xpath("//*[contains(text(),'"+product+"')]")).click();*/
			
			homepg.getspeakersImg().click();
			driver.findElement(By.xpath("//*[contains(text(),'"+product+"')]")).click();
			
			
			wLib.waitForPageToLoad();
			
			String ProductName = ShoppingCartPg.getProductDescription().getText();
			if(ProductName.trim().equalsIgnoreCase(product))
			{
				System.out.println("Searched product is correct");
				ShoppingCartPg.getAddToCart();
				
			}
			
			ShoppingCartPg.getAddToCart().click();
					System.out.println("Product added to cart successfully");
		}
		catch(Exception e){
			e.printStackTrace();
			reportLib.getScreenshot();
			System.out.println("Product added to cart Unsuccessfull");
		}
	}
	
	public void Payment(String UName,String Password) throws Exception
	{
		try
		{
			ShoppingCartPg.getmenuCart().click();
			ShoppingCartPg.getcheckOutButton().click();
			ShoppingCartPg.getnext_btn().click();
			
			PaymentGatepg.getsafepay_username().sendKeys(UName);
			PaymentGatepg.getsafepay_password().sendKeys(Password);
			PaymentGatepg.getpay_now_btn_SAFEPAY().click();
			
			String TrackinNumber = orderpg.gettrackingNumberLabel().getText();
					
			String OrderNumber = orderpg.getorderNumberLabel().getText();
			
			System.out.println("Payment successfull");
			
			System.out.println("TrackingNumber: "+TrackinNumber);
			System.out.println("OrderNumber: "+OrderNumber);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			reportLib.getScreenshot();
			System.out.println("Payment Unsuccessfull");
		}
	}
	
	/*public void Payment(String CardNumber,String CVV,String MM,String YYYY,String Cardholder_Name) throws Exception
	{
		try
		{
			ShoppingCartPg.getmenuCart().click();
			ShoppingCartPg.getcheckOutButton().click();
			ShoppingCartPg.getnext_btn().click();
			PaymentGatepg.getmasterCredit().click();
			PaymentGatepg.getCardNumber().sendKeys(CardNumber);
			PaymentGatepg.getcvv_number().sendKeys(CVV);
			Select smm = new Select(PaymentGatepg.getmmListbox());
			smm.selectByValue(MM);
			Select sYYYY = new Select(PaymentGatepg.getyyyyListbox());
			sYYYY.selectByValue(YYYY);
			PaymentGatepg.getcardholder_name().sendKeys(Cardholder_Name);
			PaymentGatepg.getPayNow().click();
			
			String TrackinNumber = orderpg.gettrackingNumberLabel().getText();
					
			String OrderNumber = orderpg.getorderNumberLabel().getText();
			
			System.out.println("Payment successfull");
			
			System.out.println("TrackinNumber: "+TrackinNumber);
			System.out.println("OrderNumber: "+OrderNumber);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			reportLib.getScreenshot();
			System.out.println("Payment Unsuccessfull");
		}
	}*/
	
	

}
	