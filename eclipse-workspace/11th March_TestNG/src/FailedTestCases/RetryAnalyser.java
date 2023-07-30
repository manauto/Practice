package FailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	int count=0;     //failed
	int Retrylimit=5;     //max 2 times TC can be executed TC if it fails
	@Override
	public boolean retry(ITestResult result) {    // method of IRetry interface
		
		if(count<Retrylimit)  {
			count++;
	     return true;
	}
		return false;
	
	}
}
