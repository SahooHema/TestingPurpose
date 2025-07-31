package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRetry implements IRetryAnalyzer{
	int retrycount=0;
	public final int maxretrycount=3;//never use count more than 2

	public boolean retry(ITestResult result) {
     if(retrycount<maxretrycount) {
    	 retrycount++;
    	 return true;
     }
		return false;
	}
}
