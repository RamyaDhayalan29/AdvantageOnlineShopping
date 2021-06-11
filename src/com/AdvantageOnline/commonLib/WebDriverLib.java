package com.AdvantageOnline.commonLib;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class WebDriverLib extends Driver{
	
public void waitForPageToLoad()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

public void acceptAlert()
{
	Alert alt = driver.switchTo().alert();
	alt.accept();

}

public void frameHandles(WebElement element)
{
	driver.switchTo().frame(element);
}

public void SwitchWindow()
{
	String parentWindow = driver.getWindowHandle();
	Set<String> handles =  driver.getWindowHandles();
	 for(String windowHandle  : handles)
	 {
	   if(!windowHandle.equals(parentWindow))
	    {
	     driver.switchTo().window(windowHandle);
	     System.out.println("successfully switched to next window");
	    }
	  }

}

public void waitFor(int millisec) throws InterruptedException
{
	Thread.sleep(millisec);
}
}
