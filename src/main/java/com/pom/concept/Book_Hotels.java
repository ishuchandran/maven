package com.pom.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotels {

	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement first_name;
		@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address ;
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	

	public Book_Hotels(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getLogout() {
		return Logout;
	}


	
	
	
	
	
	
	
	
}
