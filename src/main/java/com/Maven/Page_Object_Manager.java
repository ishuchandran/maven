package com.Maven;

import org.openqa.selenium.WebDriver;

import com.pom.concept.Book_Hotels;
import com.pom.concept.Login_Page;
import com.pom.concept.Search_Hotels;
import com.pom.concept.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;

	public Login_Page lp;
	public Search_Hotels sp;
	public Select_Hotel sh;
	public Book_Hotels bh;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getInstanceLogin() {

		if (lp == null) {

			lp = new Login_Page(driver);
		}
		return lp;
	}

	public Search_Hotels getInstanceSearch() {
		if (sp == null) {
			sp = new Search_Hotels(driver);
		}
		return sp;
	}

	public Select_Hotel getInstanceSelect() {
		if (sh == null) {
			sh = new Select_Hotel(driver);
		}
		return sh;
	}

	public Book_Hotels getInstanceBook() {
		if (bh == null) {
			bh = new Book_Hotels(driver);
		}
		return bh;
	}

}
