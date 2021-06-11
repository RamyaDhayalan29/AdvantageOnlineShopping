package com.AdvantageOnline.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orderPayment {
	
	
	@FindBy(id="trackingNumberLabel")
	private WebElement trackingNumberLabel;
	
	@FindBy(id="orderNumberLabel")
	private WebElement orderNumberLabel;
	

	public WebElement gettrackingNumberLabel() {
		return trackingNumberLabel;
	}


	public WebElement getorderNumberLabel() {
		return orderNumberLabel;
	}
	}


