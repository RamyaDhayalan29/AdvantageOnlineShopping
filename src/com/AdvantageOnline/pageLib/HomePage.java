package com.AdvantageOnline.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="speakersImg")
	private WebElement speakersImg;
	
	@FindBy(id="menuSearch")
	private WebElement menuSearch;
	
	@FindBy(id="autoComplete")
	private WebElement autoComplete;
	

	public WebElement getspeakersImg() {
		return speakersImg;
	}

	public WebElement getmenuSearch() {
		return menuSearch;
	}
	
	
	public WebElement getautoComplete() {
		return autoComplete;
	}
	
	
}
