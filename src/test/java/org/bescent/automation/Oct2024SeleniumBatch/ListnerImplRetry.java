package org.bescent.automation.Oct2024SeleniumBatch;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListnerImplRetry implements IRetryAnalyzer {

	int currentRetry=0;
	int retryCounter=5;
	public boolean retry(ITestResult result) {
		if(currentRetry<retryCounter) {
			currentRetry++;
			return true;
		}
		return false;
	}

}
