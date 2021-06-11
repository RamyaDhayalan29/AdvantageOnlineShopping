package com.AdvantageOnline.commonLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	
	static WebDriver driver = null;
	
	static String driverPath  = "C:\\jar\\";
	
	public static WebDriver fireFoxDriver()
	{
		if(driver != null)
		{
			return driver;
		}
		else
		{
			System.out.println("Launching FireFox Browser");
			driver = new FirefoxDriver();
			return driver;
		}
	}

	public static WebDriver configureDriver(){
		if(driver != null)
		{
			return driver;
		}
		else
		{
			System.out.println("Launching Internet Explorer Browser");
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			ieCapabilities.setCapability("requireWindowFocus", true);
			driver = new InternetExplorerDriver(ieCapabilities);
			return driver;
		}
	}

	
	public static WebDriver chromeDriver()
	{
		if(driver != null)
		{
			return driver;
		}
		else
		{
			System.out.println("Launching Chrome Browser");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}
	}
	
	
		
	
}
	