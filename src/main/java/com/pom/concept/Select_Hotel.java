package com.pom.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
    private WebElement button;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement Continue;
	
	public Select_Hotel(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver,this);
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinue() {
		return Continue;
	}

	
	
	
	
	
}
