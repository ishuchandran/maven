package com.properties;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


 public class Configuration_Reader {
	 
	 public static Properties p;
	 
	 public Configuration_Reader() throws Throwable {
	
		File f = new File("C:\\Users\\User\\Desktop\\Maven\\src\\main\\java\\com\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
 }
 public String geturl()throws Throwable {
	 
	 String url = p.getProperty("url");
	 return url;
 }
 public String getusername() throws Throwable  {
	 
	 String username = p.getProperty("username");
	 return username;
 }
public String getpassword() {
	
	String password = p.getProperty("password");
	return password;
}
public String getfirstName() {
	
	String Firstname = p.getProperty("Firstname");
	return Firstname;
	
}
public String getLastname() {
	
	String Lastname = p.getProperty("Lastname");
	return Lastname;
	
}
	public String getAddress() {
		
		String Address = p.getProperty("Address");
		return Address;
		
	}public String getCardnumber() {
		
			String Cardnumber = p.getProperty("Cardnumber");
			return Cardnumber;
			
		}public String getCardType() {
			
			String CardType = p.getProperty("CardType");
			return CardType;
			
		}public String getExpirymonth() {
			
			String Expirymonth = p.getProperty("Expirymonth");
			return Expirymonth;
			
		}
		public String getExpiryYear() {
			
			String ExpiryYear = p.getProperty("ExpiryYear");
			return ExpiryYear;
			
		}public String getCvv() {
			
			String Cvv = p.getProperty("Cvv");
			return Cvv;
			
		}
		
}
 
 
 
 
	
	

