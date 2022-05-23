package com.testNG.ann;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
	
		int Start = 0;
		int end = 3;
		
	public boolean retry(ITestResult result) {
		if(Start<end){
			Start++;
			return true;
		}
		return false;
	}

}
