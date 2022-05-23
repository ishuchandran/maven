package com.testNG.ann;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test
	public void insta() {
		System.out.println("instagram");

	}
	
	@Test(enabled = false)
	public void facebook() {
		System.out.println("facebook");

	}
	@Ignore
	@Test
	public void twitter() {
		System.out.println("twitter");

	}
	
	@Test
	public void watsapp() {
		System.out.println("watsapp");

	}
	

}
