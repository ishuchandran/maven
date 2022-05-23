package com.testNG.ann;

import org.testng.annotations.Test;

public class Group_Feature {
	 @Test(groups = "2")
	 private void car() {
		System.out.println("car");

	}
	 @Test(groups = "2")
	private void bike() {
		System.out.println("bike");

	}
	 @Test(groups = "1")
	private void plane() {
		System.out.println("plane");

	}
	 @Test(groups = "3")
	private void ship() {
		System.out.println("ship");

	}
	 @Test(groups = "1")
	private void biCycle() {
		System.out.println("bicycle");

	}
	 @Test(groups = "3")
	private void scooty() {
		System.out.println("scooty");
	}
	
	
	
	
	
	
	
	
	
	
	

}
