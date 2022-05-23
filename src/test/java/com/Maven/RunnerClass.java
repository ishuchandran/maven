package com.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.concept.Book_Hotels;
import com.pom.concept.Login_Page;
import com.pom.concept.Search_Hotels;
import com.pom.concept.Select_Hotel;
import com.properties.File_Reader_Manager;

public class RunnerClass extends Base_Class {
	public static WebDriver driver = browserLaunch("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();

		getUrl(url);

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();

		input(pom.getInstanceLogin().getUsername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		input(pom.getInstanceLogin().getPassword(), password);
		clickIt(pom.getInstanceLogin().getLogin());

		visibletext(pom.getInstanceSearch().getLocation(), "London");
		visibletext(pom.getInstanceSearch().getHotels(), "Hotel Sunshine");
		visibletext(pom.getInstanceSearch().getRoom_type(), "Deluxe");
		index(pom.getInstanceSearch().getRoom_nos(), 2);
		input(pom.getInstanceSearch().getDatepick_in(), "04/02/2022");
		input(pom.getInstanceSearch().getDatepick_out(), ("05/02/2022"));
		index(pom.getInstanceSearch().getAdult_room(), 2);
		index(pom.getInstanceSearch().getChild_room(), 0);
		clickIt(pom.getInstanceSearch().getSubmit());

		clickIt(pom.getInstanceSelect().getButton());
		clickIt(pom.getInstanceSelect().getContinue());

		String Firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstName();
		input(pom.getInstanceBook().getFirst_name(), "Iswarya");
		String Lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		input(pom.getInstanceBook().getLast_name(), "C");
		String Address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		input(pom.getInstanceBook().getAddress(), "chennai");
		String Cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardnumber();
		input(pom.getInstanceBook().getCc_num(), "7856423589715632");
		String CardType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardType();
		input(pom.getInstanceBook().getCardType(), "VISA");
		String Expirymonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpirymonth();
		input(pom.getInstanceBook().getCc_exp_month(), "May");
		String ExpiryYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpiryYear();
		input(pom.getInstanceBook().getExpiryYear(), "2021");
		String Cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		input(pom.getInstanceBook().getCc_cvv(), "145");
		clickIt(pom.getInstanceBook().getBook_now());
		clickIt(pom.getInstanceBook().getLogout());

	}

}
