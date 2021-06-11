package com.AdvantageOnline.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount {

	
	@FindBy(xpath="//a[@id='menuUserLink']")
	private WebElement menuUserLink;
		
	@FindBy(xpath="//a[text()='CREATE NEW ACCOUNT']")
	private WebElement CreateNewAccount;
	
	@FindBy(name="usernameRegisterPage")
	private WebElement usernameRegisterPage;
	
	@FindBy(name="emailRegisterPage")
	private WebElement emailRegisterPage;
	
	@FindBy(name="passwordRegisterPage")
	private WebElement passwordRegisterPage;
	
	@FindBy(name="confirm_passwordRegisterPage")
	private WebElement confirm_passwordRegisterPage;

	@FindBy(name="first_nameRegisterPage")
	private WebElement first_nameRegisterPage;
	
	@FindBy(name="last_nameRegisterPage")
	private WebElement last_nameRegisterPage;
		
	@FindBy(name="countryListboxRegisterPage")
	private WebElement countryListboxRegisterPage;
	
	@FindBy(name="cityRegisterPage")
	private WebElement cityRegisterPage;
	
	@FindBy(name="addressRegisterPage")
	private WebElement addressRegisterPage;
	
	@FindBy(name="postal_codeRegisterPage")
	private WebElement postal_codeRegisterPage;
	
	@FindBy(name="allowOffersPromotion")
	private WebElement allowOffersPromotion;
	
	@FindBy(name="i_agree")
	private WebElement i_agree;
	
	@FindBy(id="register_btnundefined")
	private WebElement register_btnundefined;
	
	public WebElement getMenuUserLink() {
		return menuUserLink;
	}

	public WebElement getCreateNewAccount() {
		return CreateNewAccount;
	}
	
	public WebElement getusernameRegisterPage() {
		return usernameRegisterPage;
	}

	public WebElement getemailRegisterPage() {
		return emailRegisterPage;
	}

	public WebElement getpasswordRegisterPage() {
		return passwordRegisterPage;
	}

	public WebElement getconfirm_passwordRegisterPage() {
		return confirm_passwordRegisterPage;
	}

	public WebElement getfirst_nameRegisterPage() {
		return first_nameRegisterPage;
	}

	public WebElement getlast_nameRegisterPage() {
		return last_nameRegisterPage;
	}

	public WebElement getcountryListboxRegisterPage() {
		return countryListboxRegisterPage;
	}

	public WebElement getcityRegisterPage() {
		return cityRegisterPage;
	}

	public WebElement getaddressRegisterPage() {
		return addressRegisterPage;
	}
	
	public WebElement getpostal_codeRegisterPage() {
		return postal_codeRegisterPage;
	}
	
	public WebElement getallowOffersPromotion() {
		return allowOffersPromotion;
	}
	
	public WebElement geti_agree() {
		return i_agree;
	}
	
	public WebElement getregister_btnundefined() {
		return register_btnundefined;
	}
	
	}

	
	
	
	

