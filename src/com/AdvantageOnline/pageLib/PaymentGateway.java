package com.AdvantageOnline.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentGateway {
	
	@FindBy(xpath="//input[@name='masterCredit']//parent::div")
	private WebElement masterCredit;
	
	@FindBy(xpath="//label[text()='Card number']")
	private WebElement CardNumber;
	
	@FindBy(name="cvv_number")
	private WebElement cvv_number;
	
	@FindBy(name="mmListbox")
	private WebElement mmListbox;
	
	@FindBy(name="yyyyListbox")
	private WebElement yyyyListbox;
	
	@FindBy(name="cardholder_name")
	private WebElement cardholder_name;
	
	@FindBy(id="pay_now_btn_ManualPayment")
	private WebElement PayNow;
	
	@FindBy(name="safepay_username")
	private WebElement safepay_username;
	
	@FindBy(name="safepay_password")
	private WebElement safepay_password;

	
	@FindBy(id="pay_now_btn_SAFEPAY")
	private WebElement pay_now_btn_SAFEPAY;
	
	public WebElement getmasterCredit() {
		return masterCredit;
	}

	public WebElement getCardNumber() {
		return CardNumber;
		
			}

	public WebElement getcvv_number() {
		return cvv_number;
	}

	public WebElement getmmListbox() {
		return mmListbox;
	}

	public WebElement getyyyyListbox() {
		return yyyyListbox;
	}
	
	public WebElement getcardholder_name() {
		return cardholder_name;
	}
	
	public WebElement getPayNow() {
		return PayNow;
	}
	
	public WebElement getsafepay_username() {
		return safepay_username;
	}
	
	public WebElement getsafepay_password() {
		return safepay_password;
	}
	
	public WebElement getpay_now_btn_SAFEPAY() {
		return pay_now_btn_SAFEPAY;
	}
	
}