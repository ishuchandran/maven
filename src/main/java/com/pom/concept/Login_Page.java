package com.pom.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	//WebElement user = driver.findElement(By.id("username"));
	
	@FindBy(id="username")
	private WebElement username;

	// WebElement pass = driver.findElement(By.id("password"));
	@FindBy(id="password")
	private WebElement password;
	
	//WebElement login = driver.findElement(By.id("login"));
	@FindBy(id="login")
	private WebElement login;
	
	public Login_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	

}
