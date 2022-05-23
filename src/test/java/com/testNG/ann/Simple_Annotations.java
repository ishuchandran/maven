package com.testNG.ann;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void PropertySetting() {
		System.out.println("Property Setting");

	}
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Browser Launch");

	}
	@BeforeClass
	public void urlLaunch() {
		System.out.println("URl launch");

	}
	@BeforeMethod
	public void signIn() {
		System.out.println("Signin");

	}
	  @Test(priority = -1)
      public void women() {
		System.out.println("Women");

	}
	  @Test(priority = -2)
      public void kids() {
	System.out.println("Kids");

	}
     @Test(invocationCount = 2)
      public void men() {
		System.out.println("men");

	}
     @AfterMethod
     public void signOut() {
    	 System.out.println("sign out");
		
	}
     @AfterClass
     public void deleteCookies() {
		System.out.println("Delete cookies");

	}
     @AfterTest
     public void homePage() {
		System.out.println("Home Page");

	}
     @AfterSuite
     public void quitBrowser() {
		System.out.println("Quit browser");

	}
}
