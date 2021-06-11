package com.AdvantageOnline.commonLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ReportLib extends Driver {
	
 public void getScreenshot() throws IOException
 {
	 
	 EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
	 File scrfile = edriver.getScreenshotAs(OutputType.FILE);
	 File desfile = new File("C:\\Users");
	 FileUtils.copyFileToDirectory(scrfile, desfile);
	 
	 
		}
	

}
