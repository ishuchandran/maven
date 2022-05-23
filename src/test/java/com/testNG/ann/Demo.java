package com.testNG.ann;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void task1() {
		String a1 = "ishu";
		String a2 = "ishu";
		Assert.assertEquals(a1, a2);
	}	
	@Test
	public void task2() {
		String b1 = "1234";
		String b2 = "5678";
		Assert.assertEquals(b1, b2);
	}
	
}
