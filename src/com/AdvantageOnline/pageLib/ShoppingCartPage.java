package com.AdvantageOnline.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
	
	@FindBy(id="menuCart")
	private WebElement menuCart;
	
	
	@FindBy(xpath="//div[@id='Description']/h1")
	private WebElement ProductDescription;
	
	@FindBy(name="save_to_cart")
	private WebElement AddToCart;
	
	
	@FindBy(id="checkOutButton")
	private WebElement checkOutButton;
	
	@FindBy(id="next_btn")
	private WebElement next_btn;
	

	public WebElement getmenuCart() {
		return menuCart;
	}
	

	public WebElement getAddToCart() {
		return AddToCart;
	}


	public WebElement getcheckOutButton() {
		return checkOutButton;
	}

	public WebElement getnext_btn() {
		return next_btn;
	}

	public WebElement getProductDescription() {
		return ProductDescription;
	}
	}
